public class InventoryTest {

    public static void main(String[] args) {

        InventoryManager manager = new InventoryManager();

        manager.addProduct(new Product(101, "Laptop", 20, 75000));

        manager.addProduct(new Product(102, "Mouse", 100, 800));

        manager.displayInventory();

        manager.updateProduct(101, 15, 72000);

        manager.displayInventory();

        manager.deleteProduct(102);

        manager.displayInventory();
    }
}
