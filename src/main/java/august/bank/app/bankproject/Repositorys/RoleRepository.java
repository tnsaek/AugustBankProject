package august.bank.app.bankproject.Repositorys;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import august.bank.app.bankproject.entitys.Role;


@Repository
public interface RoleRepository extends MongoRepository<Role, Long> {




}
