package eu.sulikdan.shoppingbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
//TODO pick correct one
@Inheritance()
@NoArgsConstructor
@AllArgsConstructor
public abstract class Product {

    @Id
    UUID id;

    String name;

}
