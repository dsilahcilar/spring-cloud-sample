package com.bilyoner.microservices;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Service1Controller {

    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping("/service-1")
    public String service1Controller() {
        ServiceInstance service2 = loadBalancerClient.choose("service-2");
        log.info(service2.getUri().toString());
        return "Service-1 running on port: " + serverPort;
    }
}
