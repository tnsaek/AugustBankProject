package august.bank.app.bankproject.service;

import august.bank.app.bankproject.entity.Account;
import august.bank.app.bankproject.dto.AccountDto;
import org.bson.types.ObjectId;

import java.util.List;

public interface AccountService {

    public AccountDto addAccount(AccountDto accountDto);
    public AccountDto getAccountById (String id);
    public List<AccountDto> getAllAccounts();
    public AccountDto updateAccount(String accountId,AccountDto accountDto);
    public void deleteAccount(String id);
//    TODO: implement these methods
    public void deposit(String accountId, Double amount);
    public void withdraw(String accountId, Double amount);
    public void transfer(String fromAccountId, String toAccountId, Double amount);

}

