package august.bank.app.bankproject.entity;


import lombok.Data;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@Document(collection = "transactions")
public class Transaction {

    @Id
    private Long id;

    private LocalDateTime dateTime;

    private Long number;


    private Double amount;


    private String type;


    @DocumentReference(lazy = true)
    private User from;

    @DocumentReference(lazy = true)
    private User to;

    private Double balance;


}
