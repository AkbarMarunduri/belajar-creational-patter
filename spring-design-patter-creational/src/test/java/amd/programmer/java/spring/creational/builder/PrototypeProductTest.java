package amd.programmer.java.spring.creational.builder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PrototypeProductTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testBilderPrototype() {
        Product makanan = applicationContext.getBean("productMakanan", Product.class);
        makanan.setNama("Nasi Goreng");

        Product minuman = applicationContext.getBean("productMinuman", Product.class);
        minuman.setNama("Capucino");
        minuman.setPrice(3000_000L);

        System.out.println(makanan);
        System.out.println(minuman);
    }

}