package com.bos.example.greetclient.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Component
public class FluxClient {
	private static final Logger log = LoggerFactory.getLogger(FluxClient.class);

	private WebClient webClient;
	private RestTemplate restTemplate;

	public FluxClient() {
		webClient = WebClient.create("http://localhost:8080/");
		restTemplate=new RestTemplate();
	}

	public Mono<String> callWebClient() {
		log.info("in call");
		Mono<String> val = webClient.get().uri("/greet").retrieve().bodyToMono(String.class);
		return val;
	//	val.subscribe(p -> log.info(p));
	//	val.onErrorComplete(e->log.error("Error",e));
	}
	
	public String callWithResttemplate() {
		String val=restTemplate.getForEntity("http://localhost:8080/greet", String.class).getBody();
		log.info(val);
		return val;
	}

}
