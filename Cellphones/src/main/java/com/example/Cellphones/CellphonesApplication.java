package com.example.Cellphones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(

		info=@Info(

				title="Cellphone Database",

				version="1.1.2",

				description="Cellphone and details",

				contact=@Contact(

						name="Saigukan",

						email="saigukankandasamy@gmail.com"

						)

				)	

		)
public class CellphonesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CellphonesApplication.class, args);
	}

}
