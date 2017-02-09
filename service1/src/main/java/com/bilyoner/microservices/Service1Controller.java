package com.bilyoner.microservices;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
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
    private EurekaClient eurekaClient;

    @RequestMapping("/service-1")
    public String service1Controller() {
        Application service2App = eurekaClient.getApplication("service-2");
        for (InstanceInfo instanceInfo : service2App.getInstances()) {
            log.info(instanceInfo.getHomePageUrl());
        }
        return "Service-1 running on port: " + serverPort;
    }
}
