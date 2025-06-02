package eu.sulikdan.shoppingbackend.repository;

import eu.sulikdan.shoppingbackend.entity.ShopOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ShopOrderRepo extends CrudRepository<ShopOrder, UUID> {
}
