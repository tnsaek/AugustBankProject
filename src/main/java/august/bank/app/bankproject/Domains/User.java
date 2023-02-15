package august.bank.app.bankproject.Domains;

import august.bank.app.bankproject.Entity.Role;
import org.springframework.data.annotation.Id;
import lombok.Data;

import java.util.List;



@Data
public class User {

    @Id
    private long id;

    private String name;

    private String email;

    private String password;

    private List<Role> roles;

}
