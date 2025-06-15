package eu.sulikdan.shoppingbackend.configuration.loader.specific;

import eu.sulikdan.shoppingbackend.entity.ProductModel;
import eu.sulikdan.shoppingbackend.entity.product.Bike;
import eu.sulikdan.shoppingbackend.entity.product.Book;
import eu.sulikdan.shoppingbackend.entity.product.Laptop;
import eu.sulikdan.shoppingbackend.repository.ProductModelRepo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Component
public class ProductModelLoader {

    ProductModelRepo productModelRepo;

    List<ProductModel> productModels = new ArrayList<>();


    public void loadProductModels() {

        this.productModels.addAll(
                Arrays.asList(
                        new Bike(UUID.fromString("b472fe0a-e7a9-4fc5-8863-c1ce6869e334"), "Special Gravel", null, null, null, "Tomayo", "Gravel", "Black"),
                        new Bike(UUID.fromString("0cd9d644-03ca-4903-a6f1-2925121e66ea"), "Classic Road XR", null, null, null, "Tomayo", "Road", "Yellow"),
                        new Book(UUID.fromString("ffa7088b-3726-4a92-9378-97a9bf879cf2"), "Hobits edition", null, null, null, "8kPs8OaU", "JRR Tolkien", "Hobits", LocalDate.now(), "Sogo Book Publisher"),
                        new Book(UUID.fromString("8fadbf5e-abaf-426d-9780-1953ec7bd22e"), "Dragon riders - Eragon", null, null, null, "5wcA3nm", "Patric Ruthfuss", "Eragorn", LocalDate.now(), "Sogo Book Publisher"),
                        new Laptop(UUID.fromString("5ddfb2ad-69e7-4db3-abfd-858132cea603"), "Nitro 5", null, null, null, "Asus", "Nitro 5 - 515N5", LocalDate.now())
                )
        );

        productModelRepo.saveAll(this.productModels);
    }


    public List<ProductModel> getProductModels() {
        return this.productModels;
    }


}
