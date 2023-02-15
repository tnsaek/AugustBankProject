package august.bank.app.bankproject.dtos;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import august.bank.app.bankproject.entitys.Role;

import java.util.List;

@Data
public class UserDto {
    private long id;

    private String name;

    private String email;

    private String password;

    private List<Role> roles;
}
