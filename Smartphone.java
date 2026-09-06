/**
 * Lớp con Smartphone - kế thừa Product, bổ sung thuộc tính weight (cân nặng theo gram).
 */
public class Smartphone extends Product {
    // Thuộc tính riêng của Smartphone
    private int weight;

    // Constructor không tham số
    public Smartphone() {
    }

    // Constructor đầy đủ tham số: 3 tham số chung + 1 tham số riêng
    public Smartphone(String id, String name, double price, int weight) {
        super(id, name, price); // gọi constructor lớp cha để gán id, name, price
        this.weight = weight;
    }

    // Getter / Setter cho thuộc tính riêng
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Hiển thị thông tin chung + riêng
    @Override
    public String toString() {
        return "Smartphone [" + super.toString() + ", weight=" + weight + "g]";
    }
}
