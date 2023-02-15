package august.bank.app.bankproject.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import august.bank.app.bankproject.entity.Customer;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends MongoRepository<Customer, Long> {


    
}