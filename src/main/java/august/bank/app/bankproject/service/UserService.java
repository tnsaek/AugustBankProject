package august.bank.app.bankproject.service;

import august.bank.app.bankproject.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public void create(User user);
    public List<User> readAll();
    public User readById(long id);
    public void update(long id, User user);
    public void deleteById(long id);

}
