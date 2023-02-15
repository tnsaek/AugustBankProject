package august.bank.app.bankproject.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Data;

@Document(collection = "roles")
@Data
public class Role {

    @Id
    private Long id;

    private String name;
}
