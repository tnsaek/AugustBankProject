package august.bank.app.bankproject.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "customers")
public class Customer {

    @Id

    private Long id;

    private String firstName;

    private String lastName;


    @DocumentReference(lazy = true)
    private List<Account>  accounts;





}