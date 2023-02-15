package august.bank.app.bankproject.Services.Impl;

import august.bank.app.bankproject.Domains.Customer;
import august.bank.app.bankproject.Services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;

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
