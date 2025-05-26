package eu.sulikdan.shoppingbackend.entity.product;

import eu.sulikdan.shoppingbackend.entity.Product;
import eu.sulikdan.shoppingbackend.entity.ProductModel;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bike extends ProductModel {

    String brand;
    String model;
    String color;

}
