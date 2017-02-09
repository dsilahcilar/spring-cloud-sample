package com.bilyoner.microservices;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.bilyoner.microservices.clients")
public class ClientConfiguration {
}
