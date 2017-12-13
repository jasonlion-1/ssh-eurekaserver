package com.ssh.ssheurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SshEurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(SshEurekaserverApplication.class, args);
	}
}
