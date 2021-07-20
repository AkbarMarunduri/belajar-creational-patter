package amd.programmer.java.spring.creational.builder;

import amd.programmer.java.spring.creational.builder.manual.ProductExample;
import amd.programmer.java.spring.creational.builder.manual.ProductExampleBuilder;
import org.junit.jupiter.api.Test;

class ProducExampleBuilderTest {

    @Test
    void builderExampleTest() {
        ProductExample product = new ProductExampleBuilder()
                .setId("3213")
                .setNama("Mie Instan")
                .setsku("App")
                .setPrice(10_000L)
                .builder();

        System.out.println(product);
    }

}