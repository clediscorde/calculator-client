package ca.caledi.calculatorclient.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("prime-service")
public interface PrimeServiceClient {

    @RequestMapping("/isPrime")
    boolean isPrime(@RequestParam("number") Long number);
}
