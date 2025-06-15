package eu.sulikdan.shoppingbackend.configuration.loader.specific;

import eu.sulikdan.shoppingbackend.entity.Customer;
import eu.sulikdan.shoppingbackend.repository.CustomerRepo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.UUID;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Component
public class CustomerLoader {

    CustomerRepo customerRepo;


    public void loadCustomers() {
        customerRepo.save(new Customer(
                UUID.fromString("99411446-aa46-46f6-9bae-619f80642ab1"),
                "Alice",
                "Smith",
                "alice.smith@example.com",
                new ArrayList<>(),
                new ArrayList<>(),
                null,
                null
        ));

        customerRepo.save(new Customer(
                UUID.fromString("960de02c-d67e-4ed1-bf29-42b5ed0fb6e8"),
                "Bob",
                "Johnson",
                "bob.johnson@example.com",
                new ArrayList<>(),
                new ArrayList<>(),
                null,
                null
        ));

        customerRepo.save(new Customer(
                UUID.fromString("753ae783-4457-4d05-9a12-26d71db93823"),
                "Carol",
                "Williams",
                "carol.williams@example.com",
                new ArrayList<>(),
                new ArrayList<>(),
                null,
                null
        ));
    }



}
