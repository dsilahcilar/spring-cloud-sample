package com.bilyoner.microservices;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class Service1Controller {

    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/service-1")
    public String service1Controller() {
        List<ServiceInstance> service2 = discoveryClient.getInstances("service-2");
        for (ServiceInstance serviceInstance : service2) {
            log.info(serviceInstance.getUri().toString());
        }
        return "Service-1 running on port: " + serverPort;
    }
}
