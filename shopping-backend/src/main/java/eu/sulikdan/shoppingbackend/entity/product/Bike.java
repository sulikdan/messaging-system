package eu.sulikdan.shoppingbackend.entity.product;

import eu.sulikdan.shoppingbackend.entity.Product;
import eu.sulikdan.shoppingbackend.entity.ProductModel;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Bike extends ProductModel {

    String brand;
    String model;
    String color;

    public Bike(UUID id, String name, Product product, LocalDateTime createdAt, LocalDateTime modifiedAt, String brand, String model, String color) {
        super(id, name, product, createdAt, modifiedAt);
        this.brand = brand;
        this.model = model;
        this.color = color;
    }
}
