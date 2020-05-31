
package com.acme.ecom.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;


@SpringBootApplication
@EnableConfigServer
public class EcomConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomConfigApplication.class, args);
	}

}
