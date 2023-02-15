package august.bank.app.bankproject.entity;


import lombok.Data;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
@Data
public class Customer {

    
    private Long id;

    private String firstName;

    private String lastName;


    
    private List<Account>  accounts;


    
    private List<Transaction> transactions;


}
