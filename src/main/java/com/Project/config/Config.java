package com.Project.config;



import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
		info=@Info(
				contact=@Contact(
						name="Vishnu",
						email="vishnu@gmail.com",
						url="https://some-url.com"
						),
				description="This is open api",
				title="Model",
				version="1.0",
				license=@License(
						name="MIT",
						url="https://some-url.com"
						),
				termsOfService="Terms of service"
				),
		servers=@Server(
				description="DEV ENV",
				url="http://localhost:8282"
				)
		)
public class Config {

}
