package com.example.springgraphql;
import com.example.springgraphql.entities.Bank;
import com.example.springgraphql.services.BankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringGraphqlApplication implements CommandLineRunner {
	@Autowired
	private BankServices bankServices;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringGraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Bank b1 = new Bank();
		b1.setName("Prashant Bhandari");
		b1.setPhone("905464");
		b1.setEmail("bhandariprashant58@gmail.com");
		b1.setAddress("Kathmandu");
		this.bankServices.create(b1);

	}
}
