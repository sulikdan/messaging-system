package eu.sulikdan.shoppingbackend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class ShopOrder {

    @Id
    UUID id;


    @OneToMany(mappedBy = "shopOrder")
    List<Product> productList;

    @ManyToOne
    @JoinColumn(name = "fk_customer")
    Customer customer;

    @Enumerated(EnumType.STRING)
    OrderState orderState;


    @CreatedDate
    LocalDateTime createdAt;
    @LastModifiedDate
    LocalDateTime modifiedAt;

}
