import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class Randoms implements Iterable<Integer> {
    private InfiniteIterator infiniteIterator;

    public Randoms(int min, int max) {
        if (max <= min) {
            throw new IllegalArgumentException("max должен превышать min");
        }
        infiniteIterator = new InfiniteIterator(min, max);
    }

    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return infiniteIterator;
    }
}
