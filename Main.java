
public class Main {

    public static void main(String[] args) {

        Inventory<Pen> penInventory = new Inventory<>();
        Inventory<Paper> paperInventory = new Inventory<>();

        penInventory.addItem(new Pen("Ballpoint Pen", 1.50));
        paperInventory.addItem(new Paper("A4 Paper", 5.00));

        System.out.println("Pens in inventory:");
        penInventory.listItems();

        System.out.println("\nPapers in inventory:");
        paperInventory.listItems();
    }
}
