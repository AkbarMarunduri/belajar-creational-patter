package amd.programmer.java.spring.creational.factory.inheriten;

import amd.programmer.java.spring.creational.factory.method.SosialMedia;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryInheritenApplication.class)
class FactoryInheritenApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void inheritenFactoryTest() {
        SosialMedia facebook = applicationContext.getBean("faceBookSosialMedia", SosialMedia.class);
        SosialMedia twiter = applicationContext.getBean("TwiterSosialMedia", SosialMedia.class);

        System.out.println(facebook);
        System.out.println(twiter);
    }
}