package com.Business_Calculation_Service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculationService {
		
		DataService dataService;
		
		public BusinessCalculationService(DataService dataService) {
			this.dataService = dataService;
		}
		
		@Bean
		public int findMax() {
			return Arrays.stream(dataService.retrieveData())
					.max().orElse(0);
			}
}

