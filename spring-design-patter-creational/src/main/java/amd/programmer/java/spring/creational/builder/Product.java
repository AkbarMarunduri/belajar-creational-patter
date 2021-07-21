package amd.programmer.java.spring.creational.builder;

import lombok.Builder;

//@builder untuk membuat builder secara otomatis dengan lombok
@Builder
public class Product {
    private String id;
    private String nama;
    private String sku;
    private Long price;
    private Category category;


    public Product(String id, String nama, String sku, Long price, Category category) {
        this.id = id;
        this.nama = nama;
        this.sku = sku;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", nama='" + nama + '\'' +
                ", sku='" + sku + '\'' +
                ", price=" + price +
                ", category=" + category +
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
