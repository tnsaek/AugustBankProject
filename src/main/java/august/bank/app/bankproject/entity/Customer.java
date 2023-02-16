package august.bank.app.bankproject.entity;


import august.bank.app.bankproject.dto.AccountDto;
import lombok.Data;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customers")
@Data
public class Customer {

    
    private Long id;

    private String firstName;

    private String lastName;


    
    private List<AccountDto>  accounts;


    
    private List<Transaction> transactions;


}
