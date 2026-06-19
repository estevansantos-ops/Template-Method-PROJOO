import java.util.Comparator;

public abstract class ComparatorTemplate<T, K extends Comparable<K>> implements Comparator<T> {

    @Override
    public final int compare(T o1, T o2) {
        if (o1 == null && o2 == null) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }

        K key1 = extractKey(o1);
        K key2 = extractKey(o2);

        if (key1 == null && key2 == null) {
            return 0;
        }
        if (key1 == null) {
            return -1;
        }
        if (key2 == null) {
            return 1;
        }

        return compareKeys(key1, key2);
    }

    protected abstract K extractKey(T object);

    protected int compareKeys(K key1, K key2) {
        return key1.compareTo(key2);
    }
}
