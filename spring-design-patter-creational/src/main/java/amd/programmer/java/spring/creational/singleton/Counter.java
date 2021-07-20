package amd.programmer.java.spring.creational.singleton;


public class Counter {
    private Long value=0L;

    public Long getValue() {
        return value;
    }

    //untuk menghindari race-condition maka ditambahkan syngcronize
    public synchronized void increment() {
        value++;
    }

    //
}
