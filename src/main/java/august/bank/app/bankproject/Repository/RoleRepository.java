package august.bank.app.bankproject.Repository;

import august.bank.app.bankproject.Domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
