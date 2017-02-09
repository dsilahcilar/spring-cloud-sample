package com.bilyoner.microservices.clients;

import com.bilyoner.microservices.contracts.Service1Contract;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("service-1")
public interface Service1Client extends Service1Contract {

}
