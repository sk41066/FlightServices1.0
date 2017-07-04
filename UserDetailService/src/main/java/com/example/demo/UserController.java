package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="flightService")
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping(path = "/saveUser", produces = "application/json")
	@ResponseBody
	public boolean saveUser(@RequestParam Long userid, @RequestParam String firstName, @RequestParam String lastName,
			@RequestParam String email, @RequestParam Long mobileNo) {
		User user = new User(userid, firstName, lastName, mobileNo, email);
		return userService.saveUserDetail(user);

	}
	
	@GetMapping(path = "/getUser", produces = "application/json")
	@ResponseBody
	public User saveUser(@RequestParam Long userid) {

		return userService.getUser(userid);
	}
	
	

}
