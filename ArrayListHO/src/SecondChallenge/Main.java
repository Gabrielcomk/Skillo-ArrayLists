package SecondChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Product product1 = new Product("Banana", 2.00F);
        Product product2 = new Product("Apple", 1.50F);
        Product product3 = new Product("Pineapple", 4.75F);
        Product product4 = new Product("Watermelon", 9F);
        products.add(product1);products.add(product2);products.add(product3);products.add(product4);

        System.out.println("\nProduct List: ");
        products.forEach(System.out::print);
        System.out.println("--------------------");

        Product mostCost = products.stream()
                .max((p1, p2) -> Float.compare(p1.getPrice(), p2.getPrice()))
                .orElse(null);

        System.out.println("\nMost Cost Product:");
        System.out.print(mostCost);
        System.out.println("--------------------");
    }
}
