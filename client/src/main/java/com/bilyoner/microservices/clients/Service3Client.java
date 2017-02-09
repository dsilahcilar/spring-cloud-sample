package com.bilyoner.microservices.clients;

import com.bilyoner.microservices.contracts.Service3Contract;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("service-3")
public interface Service3Client extends Service3Contract {

}
