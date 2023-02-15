package august.bank.app.bankproject.Services;

import august.bank.app.bankproject.dtos.UserDto;
import august.bank.app.bankproject.entitys.User;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public UserDto create(UserDto user);
    public List<UserDto> readAll();
    public UserDto readById(long id);
    public UserDto update(long id, UserDto userDto);
    public void deleteById(long id);

}
