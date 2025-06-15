package eu.sulikdan.shoppingbackend.configuration.loader;

import eu.sulikdan.shoppingbackend.configuration.loader.specific.CustomerLoader;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Component
public class DataLoader implements ApplicationRunner {

    CustomerLoader customerLoader;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        customerLoader.loadCustomers();




    }
}
