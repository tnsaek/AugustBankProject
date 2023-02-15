package august.bank.app.bankproject.Domains;

import august.bank.app.bankproject.Entity.Account;
import august.bank.app.bankproject.Entity.Transaction;
import lombok.Data;

import java.util.List;

@Data
public class Customer {

        private Long id;

        private String firstName;

        private String lastName;



        private List<Account> accounts;



        private List<Transaction> transactions;




}
