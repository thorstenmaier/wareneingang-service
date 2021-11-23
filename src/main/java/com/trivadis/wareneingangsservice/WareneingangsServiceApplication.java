package com.trivadis.wareneingangsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class WareneingangsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WareneingangsServiceApplication.class, args);
	}

}
