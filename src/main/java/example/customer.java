package example;
import org.springframework.data.annotation.Id;

public class customer {

	//Customer objects are stored in the mongodb noSQL databse
	@Id
	public String id;
	
	public String firstName;
	public String lastName;
	
	public customer(){}
	
	public customer(String firstName, String lastName) 
					{
		this.firstName = firstName;
		this.lastName = lastName;
					}
	
	//We have a Customer class with three attributes, id, firstName, and lastName. 
	//The id is mostly for internal use by MongoDB. You also have a single constructor
	//to populate the entities when creating a new instance.
	
	@Override
	public String toString()
					{
					return String.format("Customer[id=%s, firstName='%s' , lastName='%s']", id, firstName, lastName);
					}

}
