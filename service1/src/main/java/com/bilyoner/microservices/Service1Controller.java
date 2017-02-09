package com.bilyoner.microservices;

import com.bilyoner.microservices.clients.Service2Client;
import com.bilyoner.microservices.clients.Service3Client;
import com.bilyoner.microservices.contracts.Service1Contract;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Service1Controller implements Service1Contract {

    @Value("${server.port}")
    private String serverPort;
    @Autowired
    private Service2Client service2Client;
    @Autowired
    private Service3Client service3Client;

    @RequestMapping("/service-1")
    public String service1Controller() {
        String service2Response = service2Client.service2Controller("service-1");
        log.info("service-2 response : " + service2Response);
        String service3Response = service3Client.service3Controller(User.builder()
                .name("deniz").surname("silahcilar").build());
        log.info("service-3 response : " + service3Response);
        return "Service-1 running on port: " + serverPort;
    }
}
