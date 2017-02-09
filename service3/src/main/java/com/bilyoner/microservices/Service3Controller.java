package com.bilyoner.microservices;

import com.bilyoner.microservices.clients.Service4Client;
import com.bilyoner.microservices.contracts.Service3Contract;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Service3Controller implements Service3Contract {
    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private Service4Client service4Client;

    @RequestMapping(value = "/service-3", method = RequestMethod.POST)
    public String service3Controller(@RequestBody User user) {
        String response = service4Client.service4Controller("service-3");
        log.info("service 4 response : " + response);
        return "Service-3 running on port: " + serverPort + " user" + user.toString();
    }
}
