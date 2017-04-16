public class ArrayIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public ArrayIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    public MenuItem next() {
        MenuItem item = items[position];
        position ++;
        return item;
    }
}
