package amd.programmer.java.spring.creational.factory.method;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethodApplication {

    @Bean
    @Scope("prototype")
    public SosialMedia sosialMedia(SosialMediaType type) {
        if (type == SosialMediaType.FACEBOOK) {
            return new FaceBookSocialMedia();
        } else if (type == SosialMediaType.TWITER) {
            return new TwiterSocialMedia();
        } else {
            throw new IllegalArgumentException("Unsuppo");
        }
    }
}
