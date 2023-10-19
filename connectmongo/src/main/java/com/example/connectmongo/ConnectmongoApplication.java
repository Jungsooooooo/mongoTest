package com.example.connectmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@ComponentScan
@EnableMongoRepositories
@SpringBootApplication
public class ConnectmongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConnectmongoApplication.class, args);
	}

}
