public class Product  {
    //наименование, цена, рейтинг, количество штук на складе
    private String title;
    private double price;
    private double rating;
    private int availability;

    public Product(String title, double price, double rating, int availability) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", availability=" + availability +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    public int getAvailability() {
        return availability;
    }
}
