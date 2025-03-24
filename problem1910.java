public class problem1910 {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) s = s.replaceFirst(part, "");
        return s;
    }
}
