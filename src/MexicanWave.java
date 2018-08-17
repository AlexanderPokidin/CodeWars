import java.util.Arrays;

public class MexicanWave {

    public static String[] wave(String str) {
        int arrLength = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                arrLength--;
            }
        }

        String[] result = new String[arrLength];
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            String myStr;
            if (str.charAt(i) != ' ') {
                if (i > 0) {
                    myStr = str.substring(0, i) + str.substring(i, i + 1).toUpperCase() + str.substring(i + 1);
                } else {
                    myStr = str.substring(i, i + 1).toUpperCase() + str.substring(i + 1);
                }
                result[count] = myStr;
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(wave("hello")));
        System.out.println(Arrays.toString(wave("Two words")));
        System.out.println(Arrays.toString(wave(" gap ")));

    }
}
