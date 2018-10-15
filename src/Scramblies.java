public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return false;
        } else {
            int count = 0;
            char[] chars = str1.toCharArray();

            for (int i = 0; i < str2.length(); i++) {
                char tmp = str2.charAt(i);
                for (int j = 0; j < chars.length; j++) {
                    if (tmp == chars[j]) {
                        chars[j] = ' ';
                        count++;
                        break;
                    }
                }
            }
            return count == str2.length();
        }
    }

    public static void main(String[] args) {
        System.out.println(scramble("rkqodlw", "world"));
        System.out.println(scramble("cedewaraaossoqqyt", "codewars"));
        System.out.println(scramble("katas", "steak"));
        System.out.println(scramble("scriptjavx", "javascript"));
        System.out.println(scramble("scriptingjava", "javascript"));
        System.out.println(scramble("scriptsjava", "javascripts"));
        System.out.println(scramble("javscripts", "javascript"));
        System.out.println(scramble("aabbcamaomsccdd", "commas"));
        System.out.println(scramble("commas", "commas"));
        System.out.println(scramble("sammoc", "commas"));
    }
}
