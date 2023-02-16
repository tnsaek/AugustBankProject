package august.bank.app.bankproject.dto;


import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;


@Data
public class AccountDto {

        @Id
        private Long id;

        private String type;

        private Double balance;
        private List<TransactionDto> transactions;


}
