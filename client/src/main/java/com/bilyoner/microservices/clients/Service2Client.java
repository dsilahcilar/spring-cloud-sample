package com.bilyoner.microservices.clients;

import com.bilyoner.microservices.contracts.Service2Contract;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("service-2")
public interface Service2Client extends Service2Contract{

}
