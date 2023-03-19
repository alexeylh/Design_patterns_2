import java.util.Iterator;
import java.util.Random;

public class InfiniteIterator implements Iterator {
    protected Random random;
    private int min;
    private int max;

    public InfiniteIterator(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Object next() {
        return min + random.nextInt(max + 1 - min);
    }
}
