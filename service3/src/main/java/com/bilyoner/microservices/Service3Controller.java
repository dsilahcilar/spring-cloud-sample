package com.bilyoner.microservices;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service3Controller {
    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/service-3", method = RequestMethod.POST)
    public String service3Controller(@RequestBody User user) {
        return "Service-3 running on port: " + serverPort + " user" + user.toString();
    }
}
