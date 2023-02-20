package august.bank.app.bankproject.service.config;

import august.bank.app.bankproject.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class UserSecurityDetails implements UserDetails {

    private String name;
    private String email;
    private String password;
    private List<GrantedAuthority> authorities;

    public UserSecurityDetails(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.password = user.getPassword();
        String[] userRoles = user.getRoles().stream().map((role) -> role.getName()).toArray(String[]::new);
        this.authorities = AuthorityUtils.createAuthorityList(userRoles);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
