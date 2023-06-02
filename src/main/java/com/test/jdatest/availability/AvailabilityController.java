package com.test.jdatest.availability;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@RestController
public class AvailabilityController {

@PostMapping("/getProdAvailability")
    public String availability(@RequestBody Availability availability){
    java.util.Date reqDate= availability.getDate();

    ExecutorService executorService = Executors.newFixedThreadPool(2);
    

    return null;
}

}
