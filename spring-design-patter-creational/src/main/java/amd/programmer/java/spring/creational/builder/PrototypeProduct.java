package amd.programmer.java.spring.creational.builder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeProduct {

    //ini menggunakan prototype + builder dimana builder pattern dipanggil melalui prototype
    @Bean
    @Scope("prototype")
    public Product productMakanan() {
        return Product.builder()
                .category(Category.MAKANAN)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Product productMinuman() {
        return Product.builder()
                .category(Category.MINUMAN)
                .build();
    }
}
