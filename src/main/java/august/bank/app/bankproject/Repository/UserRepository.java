package august.bank.app.bankproject.Repository;

import august.bank.app.bankproject.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
