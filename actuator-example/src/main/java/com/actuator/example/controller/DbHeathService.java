package com.actuator.example.controller;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Controller;




@Controller
public class DbHeathService implements HealthIndicator{

	public boolean ishealthGood() 
	{
		//custom logic
		//lets say as per the Custom Logic the halth is good.So true is returned.
		
		return true;
		
	}
	
	@Override
	public Health health() {
		
		if(ishealthGood()) 
		{
			return Health.up()
					.withDetail("Database_service", "Database service is running")
					.build();
		}
		
		return Health.down().withDetail("Database_service", "DataBAse is down").build();
	}

}
