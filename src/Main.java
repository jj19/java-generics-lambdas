import java.util.List;

public class Main {
    public static void main(String[] args) {

        Inventory<Product> myInventory = new Inventory<>();


        myInventory.addItem(new Product("T-shirt", 10.99));
        myInventory.addItem(new Product("Jean", 20.49));
        myInventory.addItem(new Product("Sticker", 5.75));


        List<Product> products = myInventory.getAllItems();
        double priceTotal = products.stream()
                .mapToDouble(Product::getPrice)
                .sum();


        System.out.println("Total price of all products: " + priceTotal);
    }
}
