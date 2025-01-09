package in.aakash.rest;

import java.beans.Customizer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.aakash.binding.Customer;

@RestController
public class CustomerRestController {
	@GetMapping("/customer")
	public Customer getCustomer()
	{
		Customer c= new Customer();
		c.setGender("Male");
		c.setName("Jhon");
		c.setGmail("John12@gmail.com");
		return c;
	}
}
