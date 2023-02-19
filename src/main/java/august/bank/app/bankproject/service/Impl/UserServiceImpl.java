package august.bank.app.bankproject.service.Impl;

import august.bank.app.bankproject.dto.UserDto;
import august.bank.app.bankproject.entity.User;
import august.bank.app.bankproject.repository.UserRepository;
import august.bank.app.bankproject.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;


    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto create(UserDto userDto) {
        User user= modelMapper.map(userDto, User.class);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        try{
           User userSaved= userRepository.save(user);

           return modelMapper.map(userSaved, UserDto.class);

        }catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());

        }

    }

    @Override
    public List<UserDto> readAll() {
       List<User> users= userRepository.findAll();
       return users.stream().map(user -> modelMapper.map(user, UserDto.class)).toList();
    }

    @Override
    public UserDto readById(String id) {
        try{
            User user= userRepository.findById(id).get();
            return modelMapper.map(user, UserDto.class);
        }catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public UserDto update(String id, UserDto userDto) {
        try{
            User user= modelMapper.map(userDto, User.class);
            user.setId(id);
            User userSaved= userRepository.save(user);
            return modelMapper.map(userSaved, UserDto.class);
        }catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void deleteById(String id) {
      try{
          userRepository.deleteById(id);
      }catch (RuntimeException e){
          throw new RuntimeException(e.getMessage());
      }

    }

    @Override
    public UserDto login(String email, String password) {
        try{
            User user = userRepository.findUserByEmail(email).get();
            String encodedPassword = passwordEncoder.encode(password);

            if (user.getPassword().equals(encodedPassword)){
                return modelMapper.map(user,UserDto.class);
            } else {
                throw new UsernameNotFoundException("email or password incorrect");
            }

        } catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }

}