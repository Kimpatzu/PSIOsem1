package obiektyTestowe;

public class Product {
    private String name;
    private int code;
    private double price;

    public Product(String name, int code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return "Nazwa produktu: " + name + "\n" + "Kod produktu: " + code + "\n" + "Cena: " + price + "\n";
    }
}
