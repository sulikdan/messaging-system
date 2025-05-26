package eu.sulikdan.shoppingbackend.entity.product;

import eu.sulikdan.shoppingbackend.entity.Product;
import eu.sulikdan.shoppingbackend.entity.ProductModel;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book extends ProductModel {

    String isbn;

    String author;

    String title;

    LocalDate publicationDate;

    String publisher;

}
