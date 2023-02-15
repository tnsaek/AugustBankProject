package august.bank.app.bankproject.Service;

import august.bank.app.bankproject.Domain.Customer;

public interface CustomerService {

    Iterable<Customer> getAllCustomers();
    Customer getCustomer();
    Customer saveCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer();



}
