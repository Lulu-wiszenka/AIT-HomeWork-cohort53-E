public class Product {
    private int number;
    private String title;
    private double price;

    public Product(int number, String title, double price) {
        this.number = number;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%d) %s - %6.2f", getNumber(), getTitle(), getPrice());
    }

    public int getNumber() {
        return number;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }
}