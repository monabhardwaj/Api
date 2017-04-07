package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class controller
{
	@RequestMapping
	public class Application implements CommandLineRunner {
		
		@Autowired
		private customerRepository repository;
		
		@Override
		public void run(String... args) throws Exception{
			
			repository.deleteAll();
			
			//Manually saving 2 customers
			repository.save(new customer("Alice", "Smith"));
			repository.save(new customer("Bob", "Smith"));
			
			//fetching all customers
			System.out.println("Customers found with findAll():");
			System.out.println("-----------------------------------");
			for(customer Customer : repository.findAll()){
						System.out.println(Customer);
			}
			
			//fetching an individual customer
			System.out.println("Customer found with findByFirstName('Alice'):");
			System.out.println("-----------------------------------------------");
			System.out.println(repository.findByFirstName("Alice"));
			
			System.out.println("Customers found with findByLastName('Smith'):");
			System.out.println("---------------------------------------------------");
			for (customer Customer : repository.findByLastName("Smith"))
					{
						System.out.println(Customer);
					}
		
		}
}
}