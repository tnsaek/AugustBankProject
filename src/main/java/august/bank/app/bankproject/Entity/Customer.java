package august.bank.app.bankproject.Entity;


import lombok.Data;

import java.util.List;

//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "Customer")
@Data
public class Customer {

    
    private Long id;

    private String firstName;

    private String lastName;


    
    private List<Account>  accounts;


    
    private List<Transaction> transactions;


}
