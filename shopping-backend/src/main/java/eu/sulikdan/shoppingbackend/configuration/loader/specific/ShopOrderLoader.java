package eu.sulikdan.shoppingbackend.configuration.loader.specific;

import eu.sulikdan.shoppingbackend.repository.ShopOrderRepo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Component
public class ShopOrderLoader {

    ShopOrderRepo shopOrderRepo;


    public void loadShopOrders() {

    }

}
