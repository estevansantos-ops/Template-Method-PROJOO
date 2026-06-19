public class LengthComparator extends ComparatorTemplate<String, Integer> {

    @Override
    protected Integer extractKey(String word) {
        if (word == null) {
            return 0;
        }
        return word.length();
    }
}
