package august.bank.app.bankproject.Services;


import august.bank.app.bankproject.dtos.RoleDto;
import august.bank.app.bankproject.entitys.Role;
import august.bank.app.bankproject.repository.RoleRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import java.util.List;


public interface RoleService {

    List<RoleDto> getRoles();

    RoleDto getRoleById(Long id);

    RoleDto addRole(RoleDto roleDto);

    void deleteRole(Long id);

    RoleDto updateRole(Long id, RoleDto roleDto);





}
