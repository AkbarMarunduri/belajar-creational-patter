package amd.programmer.java.spring.creational.builder.manual;

public class ProductExample {
    private String id;
    private String nama;
    private String sku;
    private Long price;

    public ProductExample(String id, String nama, String sku, Long price) {
        this.id = id;
        this.nama = nama;
        this.sku = sku;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                '}';
    }

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

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

}
