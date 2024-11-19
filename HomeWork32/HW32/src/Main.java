/*
 Предположим, вы пишите программу для on-line магазина У каждого товара есть
 наименование, цена, рейтинг, количество штук на складе и т.д. Ваша программа
 должна предлагать пользователю выбрать, как бы он хотел сортировать товары и,
 в зависимости от выбора пользователя, выводить список товаров в нужном порядке
 (например, по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Product> onlineShop = new ArrayList<>();

        onlineShop.add(new Product("Юбка", 15.59, 4.7, 18));
        onlineShop.add(new Product("Брюки", 12.25, 4.3, 56));
        onlineShop.add(new Product("Шорты", 9.99, 3.9, 34));
        onlineShop.add(new Product("Платье", 23.99, 4.8, 75));
        onlineShop.add(new Product("Костюм", 19.69, 4.2, 11));
        onlineShop.add(new Product("Блуза", 18.39, 4.8, 45));

        printProducts(onlineShop);
        Comparator<Product> sortedList = null;
        while (true){
            sortedList = SortByType();
            if (sortedList!=null){
                printProducts(getListSorted(onlineShop, sortedList));
            } else { break;}
        }

    }

    public static Comparator<Product> SortByType(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Фильтр, выберите способ сортировки: ");
        System.out.println("1. по названию ");
        System.out.println("2. по цене ");
        System.out.println("3. по рейтингу ");
        System.out.println("4. по количеству ");
        System.out.println("5. по названию (в обратном порядке)");
        System.out.println("6. по цене (в обратном порядке)");
        System.out.println("7. по рейтингу (в обратном порядке)");
        System.out.println("8. по количеству (в обратном порядке)");

        System.out.println("любая другая цифра - выход");
        int choise = scanner.nextInt();
        switch (choise){
            case 1: return new ComparatorProductByTitle();
            case 2: return new ComparatorProductByPrice();
            case 3: return new ComparatorProductByRating();
            case 4: return new ComparatorProductByAvailability();
            case 5: return new ComparatorProductByTitle().reversed();
            case 6: return new ComparatorProductByPrice().reversed();
            case 7: return new ComparatorProductByRating().reversed();
            case 8: return new ComparatorProductByAvailability().reversed();
            default: return null;
        }

    }

    public static List<Product> getListSorted(List<Product> list, Comparator<Product> comparator){
        List<Product> result = new ArrayList<>(list);
        result.sort(comparator);
        return result;
    }

    public static void printProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }

}