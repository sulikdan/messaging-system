package eu.sulikdan.shoppingbackend.entity.product;

import eu.sulikdan.shoppingbackend.entity.Cart;
import eu.sulikdan.shoppingbackend.entity.Product;
import eu.sulikdan.shoppingbackend.entity.ProductModel;
import eu.sulikdan.shoppingbackend.entity.ShopOrder;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Laptop extends ProductModel {

    String brand;
    String model;
    LocalDate dateOfProduction;


    public Laptop(UUID id, String name, Product product, LocalDateTime createdAt, LocalDateTime modifiedAt, String brand, String model, LocalDate dateOfProduction) {
        super(id, name, product, createdAt, modifiedAt);
        this.brand = brand;
        this.model = model;
        this.dateOfProduction = dateOfProduction;
    }
}
