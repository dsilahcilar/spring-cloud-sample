package com.bilyoner.microservices.contracts;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface Service2Contract {
    @RequestMapping("/service-2/{consumerName}")
    String service2Controller(@PathVariable("consumerName") String consumerName);
}
