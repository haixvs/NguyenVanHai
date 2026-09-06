/**
 * Lớp con Tablet - kế thừa Product, bổ sung thuộc tính screenSize (kích thước màn hình, inch).
 */
public class Tablet extends Product {
    // Thuộc tính riêng của Tablet
    private double screenSize;

    // Constructor không tham số
    public Tablet() {
    }

    // Constructor đầy đủ tham số: 3 tham số chung + 1 tham số riêng
    public Tablet(String id, String name, double price, double screenSize) {
        super(id, name, price); // gọi constructor lớp cha để gán id, name, price
        this.screenSize = screenSize;
    }

    // Getter / Setter cho thuộc tính riêng
    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    // Hiển thị thông tin chung + riêng
    @Override
    public String toString() {
        return "Tablet [" + super.toString() + ", screenSize=" + screenSize + " inch]";
    }
}
