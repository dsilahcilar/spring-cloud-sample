package com.bilyoner.microservices;

import com.bilyoner.microservices.contracts.Service4Contract;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service4Controller implements Service4Contract {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/service-4", method = RequestMethod.PUT)
    public String service4Controller(@RequestHeader("X-ConsumerName") String consumer) {
        return "Service-4 running on port: " + serverPort + " consumer " + consumer;
    }

}
