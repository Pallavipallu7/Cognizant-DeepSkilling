public class SearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Keyboard", "Electronics"),
                new Product(103, "Mouse", "Accessories"),
                new Product(104, "Monitor", "Electronics"),
                new Product(105, "Speaker", "Accessories")
        };

        Product linearResult =
                SearchEngine.linearSearch(products, "Mouse");

        System.out.println("Linear Search Result:");
        System.out.println(linearResult);

        Product binaryResult =
                SearchEngine.binarySearch(products, "Mouse");

        System.out.println("\nBinary Search Result:");
        System.out.println(binaryResult);
    }
}
