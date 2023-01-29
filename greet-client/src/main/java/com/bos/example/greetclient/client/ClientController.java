package com.bos.example.greetclient.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class ClientController {
	@Autowired
	private FluxClient client;

	@GetMapping("fluxclient")
	public Mono<String> fluxClient() {
		
		return	client.callWebClient();
		
	}

	@GetMapping("restclient")
	public ResponseEntity<String> restClient() {
//		for (int i = 0; i < 100; i++) {
//			client.callWithResttemplate();
//		}
		return ResponseEntity.ok().body(client.callWithResttemplate());
	}

}
