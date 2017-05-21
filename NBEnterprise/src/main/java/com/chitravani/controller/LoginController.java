package com.chitravani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	
@RequestMapping("/")
public String welcome() {
	return "index";
}


@RequestMapping("/loginPage")
public String goToLogin() {
	
	return "login";
}

}
