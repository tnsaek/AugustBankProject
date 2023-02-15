package august.bank.app.bankproject.repository;


import august.bank.app.bankproject.entity.Role;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends MongoRepository<Role, Long> {




}
