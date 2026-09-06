/**
 * Lớp con Laptop - kế thừa Product, bổ sung thuộc tính brand (nhãn hiệu).
 */
public class Laptop extends Product {
    // Thuộc tính riêng của Laptop
    private String brand;

    // Constructor không tham số
    public Laptop() {
    }

    // Constructor đầy đủ tham số: 3 tham số chung + 1 tham số riêng
    public Laptop(String id, String name, double price, String brand) {
        super(id, name, price); // gọi constructor lớp cha để gán id, name, price
        this.brand = brand;
    }

    // Getter / Setter cho thuộc tính riêng
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Hiển thị thông tin chung + riêng
    @Override
    public String toString() {
        return "Laptop [" + super.toString() + ", brand=" + brand + "]";
    }
}
