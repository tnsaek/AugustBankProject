package august.bank.app.bankproject.controller;

import august.bank.app.bankproject.dto.AccountDto;
import august.bank.app.bankproject.service.AccountService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
     private AccountService accountService;
    @PostMapping(value = "/add/account")
    public AccountDto addAccount(@RequestBody AccountDto accountDto){
        return accountService.addAccount(accountDto);
    }
    @GetMapping(value = "/get/account/{accountId}")
    public AccountDto getAccountById(@PathVariable Long accountId){
        return accountService.getAccountById(accountId);
    }
    @GetMapping(value = "/get/list/account")
    public List<AccountDto> getAllAccounts(){
        return accountService.getAllAccounts();
    }
    @PutMapping(value = "/update/account/{accountId}")
    public AccountDto updateAccount(@PathVariable Long accountId, @RequestBody AccountDto accountDto){
        return accountService.updateAccount(accountId, accountDto);
    }
    @DeleteMapping(value = "/delete/account/{accountId}")
    public void deleteAccount(@PathVariable Long accountId){
        accountService.deleteAccount(accountId);
    }

}
