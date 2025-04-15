package eu.sulikdan.shoppingbackend.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Cart {

    UUID id;

    Customer customer;

    Order order;

    List<Product> products;

    LocalDateTime createdAt;
    LocalDateTime updatedAt;

}
