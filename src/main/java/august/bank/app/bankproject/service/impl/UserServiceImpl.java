package august.bank.app.bankproject.service.impl;

import august.bank.app.bankproject.Entity.User;
import august.bank.app.bankproject.repository.UserRepository;
import august.bank.app.bankproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void create(User user) {
        userRepository.insert(user);

    }

    @Override
    public List<User> readAll() {
        return userRepository.findAll();
    }

    @Override
    public User readById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public void update(long id, User user) {
        User u= userRepository.findById(id).orElse(null);
        u.setEmail(user.getEmail());
        u.setName(user.getName());
        u.setRoles(user.getRoles());
        u.setPassword(user.getPassword());
        userRepository.save(u);
    }

    @Override
    public void deleteById(long id) {
        userRepository.deleteById(id);

    }
}
