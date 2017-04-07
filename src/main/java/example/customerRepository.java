package example;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface customerRepository extends MongoRepository<customer, String> {

	public customer findByFirstName( String firstName);
	public List<customer> findByLastName(String lastName);
}
