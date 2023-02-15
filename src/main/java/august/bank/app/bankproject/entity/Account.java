package august.bank.app.bankproject.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;

@Document(collection = "accounts")
@Data
public class Account {

    @Id
    private Long id;

    private String type;

    private Double balance;

}
