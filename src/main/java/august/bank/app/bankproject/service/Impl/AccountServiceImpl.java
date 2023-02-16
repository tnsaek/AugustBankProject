package august.bank.app.bankproject.service.Impl;


import august.bank.app.bankproject.entity.Account;
import august.bank.app.bankproject.dto.AccountDto;
import august.bank.app.bankproject.repository.AccountRepository;
import august.bank.app.bankproject.service.AccountService;
// import io.micrometer.core.instrument.Meter;
import org.bson.types.ObjectId;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@Import({ MongoAutoConfiguration.class })
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private  ModelMapper modelMapper;
    @Override
    public AccountDto addAccount(AccountDto accountDto) {
        Account account = modelMapper.map(accountDto, Account.class);
        Account account1 = accountRepository.save(account);
        return modelMapper.map(account1, AccountDto.class);
    }

    @Override
    public AccountDto getAccountById(Long idAccount) {
        try{
            Account account = accountRepository.findById(idAccount).get();
            AccountDto accountDto = modelMapper.map(account, AccountDto.class);
            return accountDto;
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public List<AccountDto> getAllAccounts() {
        try{
            List<Account> accounts = accountRepository.findAll();
            List<AccountDto> accountDtos= accounts.stream().map(acc ->(modelMapper.map(acc, AccountDto.class))).toList();
            return accountDtos;
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }

    }

    @Override
    public AccountDto updateAccount(Long accountId, AccountDto accountDto) {
        try {
            Account account = modelMapper.map(accountDto, Account.class);
            account.setId(accountId);
            Account account1 = accountRepository.save(account);
            return modelMapper.map(account1, AccountDto.class);
        } catch (Exception e){

        }
        System.out.println("Object not found");
        throw new RuntimeException();
    }


    @Override
    public void deleteAccount(Long id) {
        try{
            accountRepository.deleteById(id);
        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }

    }

//    TODO: Implement the following methods

    @Override
    public void deposit(Long accountId, Double amount) {

    }

    @Override
    public void withdraw(Long accountId, Double amount) {

    }

    @Override
    public void transfer(Long fromAccountId, Long toAccountId, Double amount) {

    }
}
