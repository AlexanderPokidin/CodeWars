public class PlayPass {
    public static String playPass(String s, int n) {
        int l = s.length();
        char[] chars = new char[l];
        char[] anotherChars = new char[l];

        StringBuilder stringBuilder;

        for (int i = 0; i < l; i++) {

            char myChar = s.charAt(i);
            char tmp;

            if (myChar > 64 && myChar < 91) {
                tmp = (char) (s.charAt(i) + n % 26);
                if (tmp > 90) {
                    tmp = (char) (64 + n % 26 - (tmp - 90));
                }
                chars[i] = tmp;
            } else if (myChar > 96 && myChar < 123) {
                tmp = (char) (s.charAt(i) + n % 26);
                if (tmp > 122) {
                    tmp = (char) (96 + n % 26 - (tmp - 122));
                }
                chars[i] = tmp;
            } else if (myChar > 47 && myChar < 58) {
                tmp = (char) (57 - myChar);

                Integer num = (int) tmp;
                String tmpNum = num.toString();
                tmp = tmpNum.charAt(0);

                chars[i] = tmp;
            } else {
                anotherChars[i] = myChar;
            }
        }

        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                if (chars[i] > 96 && chars[i] < 123) {
                    chars[i] = (char) (chars[i] - 32);
                }
            } else {
                if (chars[i] > 64 && chars[i] < 91) {
                    chars[i] = (char) (chars[i] + 32);
                }
            }
        }

        for (int i = 0; i < l; i++) {
            if (anotherChars[i] != 0) {
                chars[i] = anotherChars[i];
            }
        }

        stringBuilder = new StringBuilder();
        stringBuilder.append(chars);

        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {

        System.out.println(playPass("I LOVE YOU!!!", 1));
        System.out.println(playPass("BORN IN 2015!", 1));
        System.out.println(playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));

    }
}
