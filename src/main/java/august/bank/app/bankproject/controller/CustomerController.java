package august.bank.app.bankproject.controller;


import august.bank.app.bankproject.dto.AccountDto;
import august.bank.app.bankproject.dto.CustomerDto;
import august.bank.app.bankproject.service.AccountService;
import august.bank.app.bankproject.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@NoArgsConstructor
@AllArgsConstructor
@CrossOrigin
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @Autowired
    private AccountService accountService;


    @GetMapping
    public List<CustomerDto> getAllCustomers() {

        return customerService.getAllCustomers();

    }

    @GetMapping("/{id}")
    public CustomerDto getCustomerById(@PathVariable String id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public CustomerDto saveCustomer(@RequestBody CustomerDto customer) {
        return customerService.saveCustomer(customer);
    }

    @PutMapping("/{id}")
    public CustomerDto updateCustomer(@PathVariable String id, @RequestBody CustomerDto customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable String id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}/accounts")
    public List<AccountDto> getCustomerAccounts(@PathVariable String id) {

        return customerService.getAllAccounts(id);

    }

    @GetMapping("/{id}/accounts/{accountId}")
    public AccountDto getCustomerAccountById(@PathVariable String id, @PathVariable String accountId) {
        return accountService.getAccountById(accountId);
    }


    @PostMapping("/{id}/accounts")
    public void addAccountToCustomer(@PathVariable String id, @RequestBody AccountDto accountDto) {
        customerService.addAccountToCustomer(id, accountDto);
    }

    @DeleteMapping("/{id}/accounts/{accountId}")
    public void deleteAccountFromCustomer(@PathVariable String id, @PathVariable String accountId) {
        customerService.deleteAccountFromCustomer(id, accountId);
    }


}
