package lab2.webfluxmongodb.controller;

import lab2.webfluxmongodb.enitiy.CustomerProfile;
import lab2.webfluxmongodb.service.CustomerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
public class CustomerProfileController {
    @Autowired
    private CustomerProfileService customerProfileService ;

//    private static final int DELAY_PER_ITEM_MS = 10;

    @GetMapping("/getCustomerProfileById/{customerId}")
    public Mono<CustomerProfile> getCustomerProfileById(@PathVariable String customerId){
        return customerProfileService.getCustomerProfileById(customerId).log();
//       return customerProfileService.getCustomerProfileById(customerId).delayElement(Duration.ofMillis(DELAY_PER_ITEM_MS)
    }

    @GetMapping("/getCustomerProfileWithLimit/{limit}")
    public Flux<CustomerProfile> getCustomerProfileWithLimit(@PathVariable Integer limit){
        return customerProfileService.getCustomerProfileWithLimit(limit);
    }



}
