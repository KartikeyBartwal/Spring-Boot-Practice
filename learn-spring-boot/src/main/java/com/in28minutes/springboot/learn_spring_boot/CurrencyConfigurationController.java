package com.in28minutes.springboot.learn_spring_boot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {

	@Autowired
	private CurrencyServiceConfiguration currency_service_configuration;

	@RequestMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieve_currency_configuration() {

		return currency_service_configuration;
	}
}
