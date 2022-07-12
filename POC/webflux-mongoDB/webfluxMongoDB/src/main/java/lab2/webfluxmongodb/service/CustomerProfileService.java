package lab2.webfluxmongodb.service;

import lab2.webfluxmongodb.enitiy.CustomerProfile;
import lab2.webfluxmongodb.repository.CustomerProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Service
public class CustomerProfileService {
    @Autowired
    private CustomerProfileRepository customerProfileRepository;
    @Autowired
    private ReactiveMongoTemplate reactiveMongoTemplate;

    public Mono<CustomerProfile> getCustomerProfileById(String id){
        return customerProfileRepository.findCustomerProfileById(id);
    }

    public Flux<CustomerProfile> getCustomerProfileWithLimit(Integer limit){ // 0..N --> Flux
        Query query = new Query();
        query.limit(limit);
        return reactiveMongoTemplate.find(query, CustomerProfile.class);
    }




}
