package amd.programmer.java.spring.creational.builder.manual;

import amd.programmer.java.spring.creational.builder.Product;
import amd.programmer.java.spring.creational.builder.manual.ProductExample;
import amd.programmer.java.spring.creational.builder.manual.ProductExampleBuilder;
import org.junit.jupiter.api.Test;

class ProductBuilderTest {

    //ini test bulder yang dibuat secara manual dari class ProductExample.java
    @Test
    void builderExampleTest() {
        ProductExample product = new ProductExampleBuilder()
                .id("3213")
                .nama("Mie Instan")
                .sku("App")
                .price(10_000L)
                .builder();

        System.out.println(product);
    }

    //ini yang dibuat oleh @Bean menggunakan depedency Lombok dari class Product.java
    @Test
    void builderTest() {
        Product product = Product.builder()
                .id("3223")
                .nama("Pisang Goreng")
                .price(1000000L)
                .sku("rare")
                .build();

        System.out.println(product);
    }

}