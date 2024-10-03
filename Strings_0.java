public class Strings_0 {
    public static void main(String[] args) {
        String sentence = "   Java is Fun!   ";

        // Trim the spaces
        String trimmed = sentence.trim();

        // Convert to upper case
        String upperCase = trimmed.toUpperCase();

        // Extract a substring
        String substring = upperCase.substring(0, 4); // "JAVA"

        // Check if contains a word
        boolean containsFun = upperCase.contains("FUN"); // true

        // Print the results
        System.out.println("Trimmed: " + trimmed);
        System.out.println("UpperCase: " + upperCase);
        System.out.println("Substring: " + substring);
        System.out.println("Contains 'FUN': " + containsFun);
    }
}
