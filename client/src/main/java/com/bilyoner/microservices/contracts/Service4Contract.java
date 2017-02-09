package com.bilyoner.microservices.contracts;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface Service4Contract {
    @RequestMapping(value = "/service-4", method = RequestMethod.PUT)
    String service4Controller(@RequestHeader("X-ConsumerName") String consumer);
}
