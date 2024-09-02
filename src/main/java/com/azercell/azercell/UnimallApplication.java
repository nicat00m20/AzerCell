package com.azercell.azercell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "AzerCell Project", version = "1.0", description = "AzerCell Project"))
public class UnimallApplication {


	
	public static void main(String[] args) {
		
		SpringApplication.run(UnimallApplication.class, args);
		
	}

}
