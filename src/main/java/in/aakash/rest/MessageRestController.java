package in.aakash.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

	public MessageRestController() {
		System.out.println("REst Controller :: Constructor");
	}

	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg() {
		String msg = "Welcome To Aakash IT";
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg = "Good Afternoon..!";
		return msg;

	}
}
