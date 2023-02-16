package august.bank.app.bankproject.dto;

import java.util.List;

import august.bank.app.bankproject.entity.Account;
import august.bank.app.bankproject.entity.Transaction;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CustomerDto {

    private Long id;

    private String firstName;

    private String lastName;


    private List<Account>  accounts;



    
}
