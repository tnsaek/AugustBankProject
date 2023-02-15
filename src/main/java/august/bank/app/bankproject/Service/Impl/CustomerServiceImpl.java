package august.bank.app.bankproject.Service.Impl;

import august.bank.app.bankproject.Domain.Customer;
import august.bank.app.bankproject.Service.CustomerService;
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
