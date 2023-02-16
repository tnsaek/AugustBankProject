package august.bank.app.bankproject.dto;

import lombok.Data;
import org.springframework.data.annotation.Id;


@Data
public class AccountDto {

        @Id
        private Long id;

        private String type;

        private Double balance;


}
