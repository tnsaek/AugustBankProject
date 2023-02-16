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
    public CustomerDto getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public CustomerDto saveCustomer(@RequestBody CustomerDto customer) {
        return customerService.saveCustomer(customer);
    }

    @PutMapping("/{id}")
    public CustomerDto updateCustomer(@PathVariable Long id, @RequestBody CustomerDto customer) {
        return customerService.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}/accounts")
    public List<AccountDto> getCustomerAccounts(@PathVariable Long id) {

        return customerService.getAllAccounts(id);

    }

    @GetMapping("/{id}/accounts/{accountId}")
    public AccountDto getCustomerAccountById(@PathVariable Long id, @PathVariable Long accountId) {
        return accountService.getAccountById(accountId);
    }


    @PostMapping("/{id}/accounts")
    public void addAccountToCustomer(@PathVariable Long id, @RequestBody AccountDto accountDto) {
        customerService.addAccountToCustomer(id, accountDto);
    }

    @DeleteMapping("/{id}/accounts/{accountId}")
    public void deleteAccountFromCustomer(@PathVariable Long id, @PathVariable Long accountId) {
        customerService.deleteAccountFromCustomer(id, accountId);
    }


}
