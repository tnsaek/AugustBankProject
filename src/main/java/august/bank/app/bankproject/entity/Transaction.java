package august.bank.app.bankproject.entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;

    private LocalDateTime dateTime;

    private String number;


    private Double amount;


    private String type;


    @DocumentReference(lazy = true)
    private Customer from;

    @DocumentReference(lazy = true)
    private Customer to;

    private Double balance;


}
