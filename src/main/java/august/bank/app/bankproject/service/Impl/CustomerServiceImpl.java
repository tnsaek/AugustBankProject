package august.bank.app.bankproject.service.Impl;

import august.bank.app.bankproject.dto.CustomerDto;
import august.bank.app.bankproject.entity.Customer;
import august.bank.app.bankproject.repository.CustomerRepository;
import august.bank.app.bankproject.service.CustomerService;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

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
            return modelMapper.map(customerRepository.save(customerEntity), CustomerDto.class);
        } catch (Exception e) {
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
}
