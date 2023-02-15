package august.bank.app.bankproject.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;

@Document(collection = "Account")
@Data
public class Account {

    @Id
    private Long id;

    private String type;

    private Double balance;

}