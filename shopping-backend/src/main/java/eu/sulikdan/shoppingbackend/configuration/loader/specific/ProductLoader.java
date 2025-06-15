package eu.sulikdan.shoppingbackend.configuration.loader.specific;

import eu.sulikdan.shoppingbackend.entity.Product;
import eu.sulikdan.shoppingbackend.repository.ProductRepo;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Component
public class ProductLoader {

    ProductRepo productRepo;

    ProductModelLoader productModelLoader;

    @Getter
    List<Product> products = new ArrayList<>();

    public void loadProducts() {

        var pm1 = productModelLoader.getProductModels().get(0);
        var pm2 = productModelLoader.getProductModels().get(1);
        var pm3 = productModelLoader.getProductModels().get(2);

        this.products.addAll(
                Arrays.asList(
                        new Product(UUID.fromString("6da0427f-d59e-4be8-92d1-1698d2287092"), 1.0, new HashSet<>(), null, pm1),
                        new Product(UUID.fromString("e7ae55e6-c9d3-4337-87da-1f33a5e89c90"), 1.0, new HashSet<>(), null, pm2),
                        new Product(UUID.fromString("06f21014-8653-43ae-93c2-2faecd457f6e"), 1.0, new HashSet<>(), null, pm3)
                )
        );

        pm1.setProduct(products.get(0));
        pm2.setProduct(products.get(1));
        pm3.setProduct(products.get(2));

        productRepo.saveAll(products);

    }

}
