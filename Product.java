/**
 * Lớp cha Product - chứa các thông tin chung của mọi sản phẩm trong cửa hàng.
 * Các lớp con: Laptop, Smartphone, Tablet sẽ kế thừa từ lớp này.
 */
public class Product {
    // Các thuộc tính chung, để private để đảm bảo tính đóng gói (encapsulation)
    private String id;      // mã số sản phẩm
    private String name;    // tên sản phẩm
    private double price;   // giá tiền

    // Constructor không tham số
    public Product() {
    }

    // Constructor đầy đủ tham số
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter / Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Hiển thị thông tin sản phẩm
    @Override
    public String toString() {
        return "id= " + id + ", name= " + name + ", price= " + price;
    }
}
