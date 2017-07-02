package pharmacy.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pharmacy.model.User;

@RestController
public class AuthenticationController {
	@CrossOrigin
	@RequestMapping(value = "/authentication", method = RequestMethod.POST)
	ResponseEntity<?> authenticateUser(@RequestBody User user) {

		if(user.getUsername().equals("chief") && user.getPassword().equals("chief123")){
			return new ResponseEntity<User>(new User("chief","",1), HttpStatus.ACCEPTED);
		}
		else if(user.getUsername().equals("pharmacist") && user.getPassword().equals("pharmacist123")){
			return new ResponseEntity<User>(new User("pharmacist","",2), HttpStatus.ACCEPTED);
		}
		else{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
}
