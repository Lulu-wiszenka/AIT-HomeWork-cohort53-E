import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
    3 Чуть сложнее
Допустим, мы пишем программу для онлайн магазина. Программа выводит на экран
список товаров (каждый товар имеет номер, название и цену).
Пользователь, используя сканнер вводит номера товаров, тем самым добавляя
их к себе в корзину. Как только пользователь заканчивает ввод
(например , вместо номера товара вводит 0) программа выдает список покупок.
 */

public class Main2 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1,"iphone", 890));
        products.add(new Product(2,"tablet", 280));
        products.add(new Product(3,"SmartTV", 570));

        List<Product> shoppers = ShoppingList(products);
        System.out.println(shoppers);
    }

    public static List<Product> ShoppingList(List<Product> products){
        Scanner scanner = new Scanner(System.in);
        List<Product> result = new ArrayList<>();
        while (true) {
            System.out.println("Введите номер товара или 0 для завершения покупок");
            int number = scanner.nextInt();
            if(number==0){
                return result;
            }
            for (int i = 0; i < products.size() ; i++) {
                if(products.get(i).getNumber()==number){
                    result.add(products.get(i));
                    System.out.println(products.get(i));
                }
            }


        }
    }

}