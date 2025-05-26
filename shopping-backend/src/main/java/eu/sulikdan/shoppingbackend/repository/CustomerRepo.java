package eu.sulikdan.shoppingbackend.repository;

import eu.sulikdan.shoppingbackend.entity.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface CustomerRepo extends CrudRepository<Customer, UUID> {
}
