import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public ArrayListIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        }
        return true;
    }

    public MenuItem next() {
        MenuItem item = items.get(position);
        position ++;
        return item;
    }
}
