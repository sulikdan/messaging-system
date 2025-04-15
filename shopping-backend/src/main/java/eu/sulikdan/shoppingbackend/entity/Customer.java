package eu.sulikdan.shoppingbackend.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.actuate.endpoint.Access;

import java.time.LocalDateTime;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {

    UUID id;

    String firstName;
    String lastName;
    String email;

    LocalDateTime createdAt;
    LocalDateTime updatedAt;

}
