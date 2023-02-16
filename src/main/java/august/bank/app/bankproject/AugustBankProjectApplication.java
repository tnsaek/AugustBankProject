package august.bank.app.bankproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class AugustBankProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(AugustBankProjectApplication.class, args);
    }

}
