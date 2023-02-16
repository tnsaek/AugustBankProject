package august.bank.app.bankproject.service;

import august.bank.app.bankproject.dto.CustomerDto;

import java.util.List;

public interface CustomerService {

    List<CustomerDto> getAllCustomers();
    CustomerDto getCustomerById(Long id);
    CustomerDto saveCustomer(CustomerDto customer);
    CustomerDto updateCustomer(Long id, CustomerDto customer);
    void deleteCustomer(Long id);



}
