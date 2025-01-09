package in.aakash.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import in.aakash.binding.Customer;

@RestController
public class CustomerRestController {
	
	public CustomerRestController() {
		System.out.println("Custome Rest :: Constructor Called...!!");
	}
	
	@GetMapping(
			value = "/customer" ,
			produces = { "application/xml", "application/json"}
	)
	public Customer getCustomer() throws Exception{
		Customer c = new Customer();
		c.setGender("Male");
		c.setName("Jhon");
		c.setGmail("John12@gmail.com");
		return c;
	}
	
	@PostMapping(
			   value = "/customer",
			   consumes = { "application/json", "application/xml"},
			   produces = {"text/plain"}
			)
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer)
	{
		System.out.println(customer);
		// logic to save customer data in the database table
		return new ResponseEntity<>("saved Customer",HttpStatus.CREATED);
	}
}
