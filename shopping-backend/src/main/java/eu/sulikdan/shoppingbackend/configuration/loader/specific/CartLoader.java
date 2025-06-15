package eu.sulikdan.shoppingbackend.configuration.loader.specific;

import eu.sulikdan.shoppingbackend.repository.CartRepo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Component
public class CartLoader {


    CartRepo cartRepo;

    public void loadCarts() {

    }


}
