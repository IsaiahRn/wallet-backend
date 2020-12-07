package com.example.wallet;

import com.example.wallet.domain.Currency;
import com.example.wallet.domain.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class WalletApplication {

	// autowired enables dependency injection
	@Autowired
	private CurrencyRepository currencyRepository;


	public static void main(String[] args) {
		SpringApplication.run(WalletApplication.class, args);
	}

		@Bean
	CommandLineRunner runner() {
		return args -> {
//			user
			currencyRepository.save(new Currency("US Dollar", "USD", new BigDecimal(100), new BigDecimal(3.92)));
			currencyRepository.save(new Currency("RW Francs", "RWF", new BigDecimal(300), new BigDecimal(4.52)));
		};
	}

}
