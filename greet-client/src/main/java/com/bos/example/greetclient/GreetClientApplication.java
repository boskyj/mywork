package com.bos.example.greetclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bos.example.greetclient.client.FluxClient;

@SpringBootApplication
public class GreetClientApplication implements CommandLineRunner {
	@Autowired
	private FluxClient client;

	public static void main(String[] args) {
		SpringApplication.run(GreetClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		for (int i = 0; i < 100; i++) {
//			client.callWithResttemplate();
//		}

	}

}
