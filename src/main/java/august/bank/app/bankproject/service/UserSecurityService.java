package august.bank.app.bankproject.service;

import august.bank.app.bankproject.entity.User;
import august.bank.app.bankproject.repository.UserRepository;
import august.bank.app.bankproject.service.config.UserSecurityDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class UserSecurityService implements UserDetailsService {

    @Autowired
    private UserRepository  userRepository;
    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByEmail(username);
        return user.map(UserSecurityDetails::new).orElseThrow(()->new UsernameNotFoundException("Username not found"));
    }
}
