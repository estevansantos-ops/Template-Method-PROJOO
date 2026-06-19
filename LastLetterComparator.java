public class LastLetterComparator extends ComparatorTemplate<String, Character> {

    @Override
    protected Character extractKey(String word) {
        if (word == null || word.isEmpty()) {
            return '\0';
        }
        char lastChar = word.charAt(word.length() - 1);
        return Character.toLowerCase(lastChar);
    }
}
