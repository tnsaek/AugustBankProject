package august.bank.app.bankproject.dto;

import august.bank.app.bankproject.entity.Customer;
import august.bank.app.bankproject.entity.User;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class TransactionDto {
    @Id
    private Long id;

    private LocalDateTime dateTime;

    private Long number;


    private Double amount;


    private String type;

    private Customer from;

    private Customer to;

    private Double balance;
}
