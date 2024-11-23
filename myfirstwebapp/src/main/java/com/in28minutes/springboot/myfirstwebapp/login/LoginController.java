package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"name", "password"})
public class LoginController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String goToLogin() {

		logger.debug("Running at debug level");
		logger.info("Running at info level");
		logger.warn("running at warning level");

		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String WelcomePage(@RequestParam String name, @RequestParam String password, ModelMap modelmap) {
		
		modelmap.put("name", name);
		modelmap.put("password", password);
		
		if(authenticationService.authenticate(name, password)) {
			return "WelcomePage";
		}
		else {
			modelmap.put("errorMessage", "Invalid Credentials");
			return "errorPage";
		}
	}

}
