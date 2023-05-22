package com.tcs.tcsregistration.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.tcs.tcsregistration.entity.User;
import com.tcs.tcsregistration.repo.UserRepo;
//import com.tcs.tcsregistration.service.UserServices;

@Controller
public class UserController {
	
	// http://localhost:8080/
	@Autowired
	private UserRepo repo;
	
	@GetMapping("/")
   public String register()//Model model
   {
		//User user=new User();
	  // model.addAttribute("user",user);
	   return "register";
   }
	
	@PostMapping("/registerUser")
	public String registerUser(@ModelAttribute User user)
	{
		System.out.println(user);
		//servic.registerUser(user);
		repo.save(user);
		return "home";
	}
}
