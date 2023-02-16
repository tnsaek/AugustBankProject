package august.bank.app.bankproject.controller;

import august.bank.app.bankproject.dto.AccountDto;
import august.bank.app.bankproject.service.AccountService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
     private AccountService accountService;
    @PostMapping(value = "")
    public AccountDto addAccount(@RequestBody AccountDto accountDto){
        return accountService.addAccount(accountDto);
    }
    @GetMapping(value = "/{accountId}")
    public AccountDto getAccountById(@PathVariable Long accountId){
        return accountService.getAccountById(accountId);
    }
    @GetMapping(value = "")
    public List<AccountDto> getAllAccounts(){
        return accountService.getAllAccounts();
    }
    @PutMapping(value = "/{accountId}")
    public AccountDto updateAccount(@PathVariable Long accountId, @RequestBody AccountDto accountDto){
        return accountService.updateAccount(accountId, accountDto);
    }
    @DeleteMapping(value = "/{accountId}")
    public void deleteAccount(@PathVariable Long accountId){
        accountService.deleteAccount(accountId);
    }
//    TODO: implement these methods
//    deposit
//    withdraw
//    transfer


}
