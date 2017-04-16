import java.util.Iterator;

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

    public Object next() {
        MenuItem item = items[position];
        position ++;
        return item;
    }

    public void remove() {
        throw new UnsupportedOperationException("不支持remove操作");
    }
}
