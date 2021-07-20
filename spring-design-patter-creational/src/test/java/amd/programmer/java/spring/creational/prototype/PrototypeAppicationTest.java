package amd.programmer.java.spring.creational.prototype;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = PrototypeAppication.class)
class PrototypeAppicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testPrototype() {
        Employe akbar = applicationContext.getBean("employeManager", Employe.class);
        akbar.setNama("Akbar");

        Employe minda = applicationContext.getBean("employeStaff", Employe.class);
        minda.setNama("Minda");

        Employe ibu = applicationContext.getBean("employeC_Level", Employe.class);
        ibu.setNama("Ibu");

        System.out.println(akbar);
        System.out.println(minda);
        System.out.println(ibu);

    }
}