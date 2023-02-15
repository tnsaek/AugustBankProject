package august.bank.app.bankproject.Repository;

import august.bank.app.bankproject.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer getCustomerById();
}