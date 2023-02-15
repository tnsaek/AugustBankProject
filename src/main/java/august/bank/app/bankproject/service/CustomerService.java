package august.bank.app.bankproject.service;

import august.bank.app.bankproject.entity.Customer;

public interface CustomerService {

    Iterable<Customer> getAllCustomers();
    Customer getCustomer();
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer();



}
