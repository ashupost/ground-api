package com.ground.dating.starter.hello;

import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@CrossOrigin
	@RequestMapping(value="/hello", 
			method=RequestMethod.GET
			, produces = "application/json"
			)
	public List<User> sayHi() {
		
		return Arrays.asList(new User(100, "Rakhi"), new User(200,
				"Shaurya11122222"));
	}
	
	
	
	
	
	
	
}
