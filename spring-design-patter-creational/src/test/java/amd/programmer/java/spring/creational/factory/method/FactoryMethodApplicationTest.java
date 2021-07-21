package amd.programmer.java.spring.creational.factory.method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = FactoryMethodApplication.class)
class FactoryMethodApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testFactoryMethod() {
        SosialMedia facebook = applicationContext.getBean(SosialMedia.class, SosialMediaType.FACEBOOK);
        SosialMedia twiter = applicationContext.getBean(SosialMedia.class, SosialMediaType.TWITER   );

        System.out.println(facebook);
        System.out.println(twiter);

    }

}