package com.techthinkers.spro_user_service.healthcheck;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MemoryHealthIndicator implements HealthIndicator {

	@Override
	public Health health() {
		long freeMemory = Runtime.getRuntime().freeMemory();
		long totalMemory = Runtime.getRuntime().totalMemory();
		
		Double freeMemoryPercent = ((double) freeMemory/(double) totalMemory) * 100;
		
		if(freeMemoryPercent > 25) {
			return Health.up()
					.withDetail("freeMemory", freeMemory + " bytes")
					.withDetail("totalMemory", totalMemory + " bytes")
					.withDetail("freeMemoryPercent", freeMemoryPercent + " bytes")
					.build();
		} else {
			return Health.down()
					.withDetail("freeMemory", freeMemory + " bytes")
					.withDetail("totalMemory", totalMemory + " bytes")
					.withDetail("freeMemoryPercent", freeMemoryPercent + " bytes")
					.build();
		}	
	}
}