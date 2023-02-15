package august.bank.app.bankproject.service;


import august.bank.app.bankproject.dto.RoleDto;
import august.bank.app.bankproject.entity.Role;
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
