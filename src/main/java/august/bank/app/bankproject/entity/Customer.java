package august.bank.app.bankproject.entity;


import lombok.Data;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


@Data
@Document(collection = "customers")
public class Customer {

    @Id
    private Long id;

    private String firstName;

    private String lastName;


    @DocumentReference(lazy = true)
    private List<Account>  accounts;


    @DocumentReference(lazy = true)
    private List<Transaction> transactions;


}