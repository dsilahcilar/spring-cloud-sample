package com.bilyoner.microservices.clients;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-2")
public interface Service2Client {

    @RequestMapping("/service-2/{consumerName}")
    String service2Controller(@PathVariable("consumerName") String consumerName);

}
