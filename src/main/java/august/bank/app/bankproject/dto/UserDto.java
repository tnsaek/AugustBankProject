package august.bank.app.bankproject.dto;

import lombok.Data;
import august.bank.app.bankproject.entity.Role;

import java.util.List;

@Data
public class UserDto {
    private long id;

    private String name;

    private String email;

    private String password;

    private List<Role> roles;
}
