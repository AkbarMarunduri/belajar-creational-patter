package amd.programmer.java.spring.creational.factory.inheriten;

import amd.programmer.java.spring.creational.factory.method.FaceBookSocialMedia;
import amd.programmer.java.spring.creational.factory.method.SosialMedia;
import amd.programmer.java.spring.creational.factory.method.TwiterSocialMedia;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryInheritenApplication {

    @Bean
    @Scope("prototype")
    public SosialMedia faceBookSosialMedia() {
        return new FaceBookSocialMedia();
    }

    @Bean
    @Scope("prototype")
    public SosialMedia TwiterSosialMedia() {
        return new TwiterSocialMedia();
    }
}
