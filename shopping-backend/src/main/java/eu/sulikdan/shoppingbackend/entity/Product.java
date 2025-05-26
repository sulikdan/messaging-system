package eu.sulikdan.shoppingbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Set;
import java.util.UUID;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    UUID id;

    // TODO some reduction to selected entities or it will blow up ... :D
    @ManyToMany(mappedBy = "cartProducts")
    Set<Cart> cart;

    // No returns yet
    @ManyToOne
    @JoinColumn(name = "fk_order")
    ShopOrder shopOrder;

    @OneToOne
    ProductModel productModel;

}
