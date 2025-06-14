package eu.sulikdan.shoppingbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ShoppingBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingBackendApplication.class, args);
	}

}
