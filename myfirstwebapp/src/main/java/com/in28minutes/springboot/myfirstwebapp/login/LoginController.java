package com.in28minutes.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("login")
//	public String goToLogin(@RequestParam String name, ModelMap model) {
	public String goToLogin() {

		logger.debug("Running at debug level");
		logger.info("Running at info level");
		logger.warn("running at warning level");

//		model.put("name", name);
//		System.out.println(name);
		return "login";
	}
}
