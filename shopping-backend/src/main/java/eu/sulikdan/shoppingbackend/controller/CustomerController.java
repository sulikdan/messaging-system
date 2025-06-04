package eu.sulikdan.shoppingbackend.controller;

import eu.sulikdan.shoppingbackend.entity.Customer;
import eu.sulikdan.shoppingbackend.repository.CustomerRepo;
import eu.sulikdan.shoppingbackend.service.CustomerService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/customer")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CustomerController {

    CustomerService customerService;
    CustomerRepo customerRepo;


    @GetMapping("{id}")
    public Customer getCustomer(@PathVariable UUID id) {
        log.info("Get customer with id {}", id);
        return customerRepo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    @PostMapping
    public Customer createCustomer(Customer customer) {
        log.info("Create customer with id {}", customer.getId());
        return customerRepo.save(customer);
    }

    @PutMapping("{id}")
    public Customer updateCustomer(@PathVariable UUID id, @RequestBody Customer customer) {
        if( !id.equals(customer.getId()) ) {
            throw new RuntimeException("Customer id not match");
        }

        Customer foundCustomer = customerRepo.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));

        return customerRepo.save(customer);
    }


}
