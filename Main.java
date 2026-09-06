/** Lớp Main để kiểm tra các lớp con của Product */
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tạo ra danh sách các sản phẩm (Product) để lưu trữ các đối tượng con
        List<Product> products = new ArrayList<>();

        // tạo ra 05 sản phẩm là các đối tượng con của Product và thêm vào danh sách 
        products.add(new Smartphone("S001", "iPhone 12", 999.99, 150));
        products.add(new Tablet("T001", "iPad Pro", 799.99, 12.9));
        products.add(new Laptop("L001", "MacBook Pro", 1299.99, "Apple"));
        products.add(new Smartphone("S002", "Samsung Galaxy S21", 899.99, 128));
        products.add(new Tablet("T002", "Samsung Galaxy Tab S7", 699.99, 11.0));

        // In ra thông tin tất cả các sản phẩm
        for (Product product : products) {
            System.out.println(product);
        }
    }
}