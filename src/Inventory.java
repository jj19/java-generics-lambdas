import java.util.ArrayList;
import java.util.List;

public class Inventory<T> {
    private List<T> itemList;

    public Inventory() {
        itemList = new ArrayList<>();
    }

    public List<T> getAllItems() {
        return itemList;
    }

    public void addItem(T item) {
        itemList.add(item);
    }

    public List<T> removeItem(T item) {
        itemList.remove(item);
        return itemList;
    }

    public int getItemCount() {
        return itemList.size();
    }
}
