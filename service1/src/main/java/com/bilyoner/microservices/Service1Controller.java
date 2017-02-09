package com.bilyoner.microservices;

import com.bilyoner.microservices.clients.Service2Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Service1Controller {

    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private Service2Client service2Client;

    @RequestMapping("/service-1")
    public String service1Controller() {
        String response = service2Client.service2Controller("service-1");
        log.info("service-2 response : " + response);
        return "Service-1 running on port: " + serverPort;
    }
}
