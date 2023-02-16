package august.bank.app.bankproject.service;

import august.bank.app.bankproject.entity.Account;
import august.bank.app.bankproject.dto.AccountDto;
import org.bson.types.ObjectId;

import java.util.List;

public interface AccountService {

    public AccountDto addAccount(AccountDto accountDto);
    public AccountDto getAccountById (Long id);
    public List<AccountDto> getAllAccounts();
    public AccountDto updateAccount(Long accountId,AccountDto accountDto);
    public void deleteAccount(Long id);
//    TODO: implement these methods
    public void deposit(Long accountId, Double amount);
    public void withdraw(Long accountId, Double amount);
    public void transfer(Long fromAccountId, Long toAccountId, Double amount);

}

