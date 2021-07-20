package amd.programmer.java.spring.creational.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class PrototypeAppication {

    //pada prototype setelah @Bean harus ditambahkan scope
    @Bean
    @Scope("prototype")
    public Employe employeStaff() {
        Employe employe = new Employe();
        employe.setPosition(Position.STAFF);
        employe.setSalary(10_000_000);
        return employe;
    }

    @Bean
    @Scope("prototype")
    public Employe employeManager() {
        Employe employe = new Employe();
        employe.setPosition(Position.MANAGER);
        employe.setSalary(20_000_000);
        return employe;
    }

    @Bean
    @Scope("prototype")
    public Employe employeVicePresiden() {
        Employe employe = new Employe();
        employe.setPosition(Position.VICE_PRESIDEN);
        employe.setSalary(30_000_000);
        return employe;
    }

    @Bean
    @Scope("prototype")
    public Employe employeC_Level() {
        Employe employe = new Employe();
        employe.setPosition(Position.C_LEVEL);
        employe.setSalary(40_000_000);
        return employe;
    }

}
