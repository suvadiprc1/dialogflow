package com.example.demoaws.configs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean
	public Map<String, List<String>> carMakes() {
		final Map<String, List<String>> makes = new HashMap<>();
		final List<String> models = new ArrayList<>();
		models.add("Alto");
		models.add("Wagon R");
		models.add("Swift");
		models.add("Baleno");
		makes.put("Maruti", models);
		final List<String> models1 = new ArrayList<>();
		models1.add("i10");
		models1.add("i20");
		models1.add("eon");
		makes.put("Hyundai", models);
		final List<String> models2 = new ArrayList<>();
		models2.add("city");
		models2.add("civic");
		models2.add("bryo");
		makes.put("Honda", models);
		return makes;
	}
	
}
