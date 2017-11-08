package ca.caledi.calculatorclient.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("prime-factors-service")
public interface PrimeFactorsServiceClient {

    @RequestMapping("/getPrimeFactors")
    public Map<Long, Integer> getPrimeFactors(@RequestParam("number") Long number);
}
