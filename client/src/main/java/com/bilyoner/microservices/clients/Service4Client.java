package com.bilyoner.microservices.clients;

import com.bilyoner.microservices.contracts.Service4Contract;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("service-4")
public interface Service4Client extends Service4Contract {

}
