public class PangramChecker {
    public static boolean check(String sentence) {
        boolean isTrue = true;
        String cleanString = sentence.toLowerCase().replaceAll("[^a-z]", "");

        for (int j = 0; j < 26; j++) {
            char tmp = (char) ('a' + j);
            String tmpStr = String.valueOf(tmp);
            {
                if (!cleanString.contains(tmpStr)) {
                    isTrue = false;
                    break;
                }
            }
        }
        return isTrue;
    }

    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("The uuick brown fox jumps over the lazy dog."));
        System.out.println(check("The quick brown fox1 jumps over the lazy dog."));
    }
}
