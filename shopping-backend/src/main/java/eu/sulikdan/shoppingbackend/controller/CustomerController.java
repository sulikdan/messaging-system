package eu.sulikdan.shoppingbackend.controller;

import eu.sulikdan.shoppingbackend.entity.Customer;
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

@Slf4j
@RestController
@RequestMapping("/customer")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CustomerController {

    CustomerService customerService;


    @GetMapping("{id}")
    public Customer getCustomer(@PathVariable String id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @PostMapping
    public Customer createCustomer(Customer customer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @PutMapping("{id}")
    public Customer updateCustomer(@PathVariable String id, @RequestBody Customer customer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
