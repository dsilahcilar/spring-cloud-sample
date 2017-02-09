package com.bilyoner.microservices;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service1Controller {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/service-1")
    public String service1Controller() {
        return "Service-1 running on port: " + serverPort;
    }
}
