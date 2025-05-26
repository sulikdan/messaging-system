package eu.sulikdan.shoppingbackend.repository;

import eu.sulikdan.shoppingbackend.entity.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepo extends CrudRepository<Order, UUID> {
}
