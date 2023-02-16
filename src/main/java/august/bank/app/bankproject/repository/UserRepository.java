package august.bank.app.bankproject.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import august.bank.app.bankproject.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}