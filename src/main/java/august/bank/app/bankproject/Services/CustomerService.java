package august.bank.app.bankproject.Services;

import august.bank.app.bankproject.Domains.Customer;

public interface CustomerService {

    Iterable<Customer> getAllCustomers();
    Customer getCustomer();
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer();



}
