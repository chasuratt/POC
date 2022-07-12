package com.lab2.customerdomainmongodb.controller;


import com.lab2.customerdomainmongodb.dto.AddressCisDto;
import com.lab2.customerdomainmongodb.dto.CustomerCisDto;
import com.lab2.customerdomainmongodb.dto.CustomerProfileOnlyDto;
import com.lab2.customerdomainmongodb.dto.InvestmentCisDto;
import com.lab2.customerdomainmongodb.entity.CustomerCis;
import com.lab2.customerdomainmongodb.entity.CustomerProfile;
import com.lab2.customerdomainmongodb.repository.CustomerProfileRepository;
import com.lab2.customerdomainmongodb.service.CustomerProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerProfileController {
    @Autowired
    CustomerProfileService customerProfileService ;

    @Autowired
    CustomerProfileRepository customerProfileRepository;


    @GetMapping("/getCustomerProfileById/{customerId}") // for load test
    public Optional<CustomerProfile> getCustomerProfileById(@PathVariable String customerId) throws InterruptedException {
//        Thread.sleep(10);
        return customerProfileService.getCustomerProfileById(String.valueOf(customerId));
    }

    @GetMapping("/getCustomerProfileWithLimit/{limit}") // for load test
    public List<CustomerProfile> getCustomerProfileWithLimit(@PathVariable int limit){
        return customerProfileService.getCustomerProfileWithLimit(limit);
    }



//    @GetMapping("/getCustomerProfileOnly/{limit}")
//    public List<CustomerProfile> getCustomerProfileOnlyWithLimit(@PathVariable int limit){
//        return customerProfileService.getCustomerProfileOnlyWithLimit(limit);
//    }
//
//    @GetMapping("/getCustomerCisWithLimit/{limit}")
//    public List<CustomerCisDto>getCustomerCisWithLimit(@PathVariable int limit){
//        return customerProfileService.getCustomerCisWithLimit(limit/2);
//    }
//
//    @GetMapping("/getAddressCisWithLimit/{limit}")
//    public List<AddressCisDto> getAddressCisWithLimit(@PathVariable int limit){
//        return customerProfileService.getAddressCisWithLimit(limit/4);
//    }
//
//    @GetMapping("/getInvestmentLimitCisWithLimit/{limit}")
//    public List<InvestmentCisDto>  getInvestmentLimitCisWithLimit(@PathVariable int limit){
//        return customerProfileService.getInvestmentLimitCisWithLimit(limit/2);
//    }








}
