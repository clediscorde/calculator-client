package ca.caledi.calculatorclient.controller;

import ca.caledi.calculatorclient.client.PrimeServiceClient;
import ca.caledi.calculatorclient.client.PrimeFactorsServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class CalculatorController {
    @Autowired
    private PrimeServiceClient primeServiceClient;

    @Autowired
    private PrimeFactorsServiceClient primeFactorsServiceClient;

    @ResponseBody
    @RequestMapping("/isPrime")
    public Boolean isPrime(@RequestParam(value = "number") long number) {
        return primeServiceClient.isPrime(number);
    }

    @ResponseBody
    @RequestMapping("/getPrimeFactors")
    public Map<Long, Integer> getPrimeFactors(@RequestParam(value = "number") long number) {
        return primeFactorsServiceClient.getPrimeFactors(number);
    }
}
