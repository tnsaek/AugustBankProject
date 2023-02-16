package august.bank.app.bankproject.service.Impl;


import august.bank.app.bankproject.entity.Account;
import august.bank.app.bankproject.dto.AccountDto;
import august.bank.app.bankproject.repository.AccountRepository;
import august.bank.app.bankproject.service.AccountService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public AccountDto addAccount(AccountDto accountDto) {
        Account account = modelMapper.map(accountDto, Account.class);
        Account account1 = accountRepository.save(account);
        return modelMapper.map(account1, AccountDto.class);
    }

    @Override
    public AccountDto getAccountById(String idAccount) {
        try {
            Account account = accountRepository.findById(idAccount).get();
            return modelMapper.map(account, AccountDto.class);
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public List<AccountDto> getAllAccounts() {
        try {
            List<Account> accounts = accountRepository.findAll();
            return accounts.stream().map(acc -> (modelMapper.map(acc, AccountDto.class))).toList();
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public AccountDto updateAccount(String accountId, AccountDto accountDto) {
        try {
            Account account = modelMapper.map(accountDto, Account.class);
            account.setId(accountId);
            Account account1 = accountRepository.save(account);
            return modelMapper.map(account1, AccountDto.class);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    @Override
    public void deleteAccount(String id) {
        try {
            accountRepository.deleteById(id);
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }

    }

//    TODO: Implement the following methods

    @Override
    public void deposit(String accountId, Double amount) {

    }

    @Override
    public void withdraw(String accountId, Double amount) {

    }

    @Override
    public void transfer(String fromAccountId, String toAccountId, Double amount) {

    }
}
