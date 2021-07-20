package amd.programmer.java.spring.creational.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = SingletonApplication.class)
class SingletonApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void singleton() {
        //intansiasi class pada ban menggunakan applicationContext.getBean(nama_kelas)
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);
        Counter counter3 = applicationContext.getBean(Counter.class);

        counter1.increment();
        counter2.increment();
        counter3.increment();

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
        System.out.println(counter3.getValue());

    }


    private void incrementCounterAssyng(Counter counter,int total) {
        new Thread(() -> {
            for (int i = 0; i < total; i++) {
                counter.increment();
            }
        }).start();
    }

    @Test
    void icrementAssyng() throws InterruptedException {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);

        incrementCounterAssyng(counter1,1000000);
        incrementCounterAssyng(counter2,1000000);

        Thread.sleep(5_000L);

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
    }
}