package eu.sulikdan.shoppingbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class Customer {

    @Id
    @org.hibernate.validator.constraints.UUID
    UUID id;

    @NotBlank
    String firstName;
    @NotBlank
    String lastName;

    @Email
    String email;

    @OneToMany(mappedBy = "customer")
    List<ShopOrder> shopOrderList;

    @OneToMany(mappedBy = "customer")
    List<Cart> cartList;

    @CreatedDate
    LocalDateTime createdAt;
    @LastModifiedDate
    LocalDateTime updatedAt;

}
