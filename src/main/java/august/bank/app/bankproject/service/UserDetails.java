package august.bank.app.bankproject.service;

import august.bank.app.bankproject.entity.User;
import august.bank.app.bankproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserDetails implements UserDetailsService {

    @Autowired
    private UserRepository  userRepository;
    @Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUserByEmail(username).orElseThrow(()-> new UsernameNotFoundException("Email "+ username + " not found."));

        return user;


    }
}
