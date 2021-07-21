package amd.programmer.java.spring.creational.builder.manual;

//ini adalah builder patter dari class Product.java jika dibuild secara manual
public class ProductExampleBuilder {
    private String id;
    private String nama;
    private String sku;
    private Long price;

    public ProductExampleBuilder id(String id) {
        this.id = id;
        return this;
    }
    public ProductExampleBuilder nama(String nama) {
        this.nama = nama;
        return this;
    }
    public ProductExampleBuilder sku(String sku) {
        this.sku = sku;
        return this;
    }
    public ProductExampleBuilder price(Long price) {
        this.price = price;
        return this;
    }

    public ProductExample builder() {
        return new ProductExample(id, nama, sku, price);
    }

}
