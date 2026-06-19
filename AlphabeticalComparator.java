public class AlphabeticalComparator extends ComparatorTemplate<String, String> {

    @Override
    protected String extractKey(String word) {
        if (word == null) {
            return "";
        }
        return word.toLowerCase();
    }
}
