package com.bilyoner.microservices.contracts;

import com.bilyoner.microservices.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface Service3Contract {
    @RequestMapping(value = "/service-3", method = RequestMethod.POST)
    String service3Controller(@RequestBody User user);
}
