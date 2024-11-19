import java.util.Comparator;

public class ComparatorProductByAvailability implements Comparator<Product> {


    @Override
    public int compare(Product o1, Product o2) {
        return o1.getAvailability() - o2.getAvailability();
    }

}
