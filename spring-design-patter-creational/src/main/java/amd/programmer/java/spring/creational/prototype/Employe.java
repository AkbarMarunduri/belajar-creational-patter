package amd.programmer.java.spring.creational.prototype;

public class Employe {
    private String id;
    private String nama;
    private Position position;
    private long salary;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                ", position=" + position +
                ", salary=" + salary +
                '}';
    }
}
