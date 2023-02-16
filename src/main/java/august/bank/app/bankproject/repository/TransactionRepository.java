package august.bank.app.bankproject.repository;

import august.bank.app.bankproject.entity.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository extends MongoRepository<Transaction, Long> {
    Optional<List<Transaction>> findByDateTime(LocalDateTime dateTime);

    Optional<List<Transaction>> findByNumber(Long number);

    Optional<List<Transaction>> findByFromId(Long id);

    Optional<List<Transaction>> findByToId(Long id);

    Optional<List<Transaction>> findByType(String type);


}
