
import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends OfficeSupply> {

    private List<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void listItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
