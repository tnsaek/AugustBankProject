package august.bank.app.bankproject.Domains;


import org.springframework.data.annotation.Id;


import lombok.Data;

@Data
public class Role {

    @Id
    private Long id;

    private String name;
}
