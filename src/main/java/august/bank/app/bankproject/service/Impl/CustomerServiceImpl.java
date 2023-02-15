package august.bank.app.bankproject.service.Impl;

import august.bank.app.bankproject.entity.Customer;
import august.bank.app.bankproject.service.CustomerService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerService customerService;

    @Override
    public Iterable<Customer> getAllCustomers() {

        return customerService.getAllCustomers();
    }

    @Override
    public Customer getCustomer() {
        return customerService.getCustomer();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerService.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer() {
        
    }
}
