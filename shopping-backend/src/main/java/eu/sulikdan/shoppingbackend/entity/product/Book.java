package eu.sulikdan.shoppingbackend.entity.product;

import eu.sulikdan.shoppingbackend.entity.Product;
import eu.sulikdan.shoppingbackend.entity.ProductModel;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Book extends ProductModel {

    String isbn;

    String author;

    String title;

    LocalDate publicationDate;

    String publisher;


    public Book(UUID id, String name, Product product, LocalDateTime createdAt, LocalDateTime modifiedAt, String isbn, String author, String title, LocalDate publicationDate, String publisher) {
        super(id, name, product, createdAt, modifiedAt);
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.publicationDate = publicationDate;
        this.publisher = publisher;
    }
}
