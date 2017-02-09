package com.bilyoner.microservices.contracts;

import org.springframework.web.bind.annotation.RequestMapping;

public interface Service1Contract  {
    @RequestMapping("/service-1")
    String service1Controller();
}
