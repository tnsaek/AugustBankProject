package august.bank.app.bankproject.service.Impl;

import august.bank.app.bankproject.dto.AccountDto;
import august.bank.app.bankproject.dto.CustomerDto;
import august.bank.app.bankproject.entity.Account;
import august.bank.app.bankproject.entity.Customer;
import august.bank.app.bankproject.repository.AccountRepository;
import august.bank.app.bankproject.repository.CustomerRepository;
import august.bank.app.bankproject.service.AccountService;
import august.bank.app.bankproject.service.CustomerService;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;


    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CustomerDto> getAllCustomers() {
        return customerRepository.findAll().stream()
                .map(customer -> modelMapper.map(customer, CustomerDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDto getCustomerById(Long id) {
        try {
            Customer customer = customerRepository.findById(id).get();
            return modelMapper.map(customer, CustomerDto.class);
        } catch (Exception e) {
            throw new RuntimeException("Customer not found");
        }
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customer) {
        try {
            Customer customerEntity = modelMapper.map(customer, Customer.class);
            Customer savedCustomer = customerRepository.save(customerEntity);
            return modelMapper.map(savedCustomer, CustomerDto.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
            throw new RuntimeException("Customer not saved");
        }
    }


    @Override
    public CustomerDto updateCustomer(Long id, CustomerDto customer) {
        try {
            Customer customerEntity = modelMapper.map(customer, Customer.class);
            customerEntity.setId(id);
            return modelMapper.map(customerRepository.save(customerEntity), CustomerDto.class);
        } catch (Exception e) {
            throw new RuntimeException("Customer not updated");
        }
    }

    @Override
    public void deleteCustomer(Long id) {
        try {
            customerRepository.deleteById(id);
        } catch (Exception e) {
            throw new RuntimeException("Customer not deleted");
        }
    }

    @Override
    public List<AccountDto> getAllAccounts(Long id) {
        try {
            Customer customer = customerRepository.findById(id).get();
            return customer.getAccounts().stream()
                    .map(account -> modelMapper.map(account, AccountDto.class))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Customer not found");
        }
    }

    @Override
    public void addAccountToCustomer(Long customerId, AccountDto accountDto) {
        try {
            Customer customer = customerRepository.findById(customerId).get();
            Account account = modelMapper.map(accountDto, Account.class);
            customer.getAccounts().add(account);
            customerRepository.save(customer);
            accountRepository.save(account);
        } catch (Exception e) {
            throw new RuntimeException("Customer not found");
        }

    }

    @Override
    public void deleteAccountFromCustomer(Long customerId, Long accountId) {

        try {
            Customer customer = customerRepository.findById(customerId).get();
            Account account = accountRepository.findById(accountId).get();
            customer.getAccounts().remove(account);
            accountRepository.deleteById(accountId);
            customerRepository.save(customer);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }

    }




}
