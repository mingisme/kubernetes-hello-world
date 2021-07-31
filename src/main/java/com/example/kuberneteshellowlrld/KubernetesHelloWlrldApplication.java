package com.example.kuberneteshellowlrld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class KubernetesHelloWlrldApplication {

	public static void main(String[] args) {
		SpringApplication.run(KubernetesHelloWlrldApplication.class, args);
	}

}
