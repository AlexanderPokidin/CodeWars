import java.util.ArrayList;
import java.util.List;

public class Validate {
    public static boolean validate(String n) {

        int length = n.length();
        int res;
        Integer stringInt = 0;
        List<Integer> resInt = new ArrayList<>();

        if (length % 2 == 0) {
            for (int i = 0; i < length; i++) {
                if (i % 2 == 0) {
                    res = Integer.parseInt(n.substring(i, i + 1)) * 2;
                    if (res > 9) {
                        res = res - 9;
                    }
                } else {
                    res = Integer.parseInt(n.substring(i, i + 1));
                }

                resInt.add(res);
            }
        } else {
            resInt.add(Integer.parseInt(n.substring(0, 1)));

            for (int i = 1; i < length; i++) {
                if (i % 2 != 0) {
                    res = Integer.parseInt(n.substring(i, i + 1)) * 2;
                    if (res > 9) {
                        res = res - 9;
                    }
                } else {
                    res = Integer.parseInt(n.substring(i, i + 1));
                }

                resInt.add(res);
            }
        }
        for (Integer r : resInt) {
            stringInt = stringInt + r;
        }
        return stringInt % 10 == 0;
    }

    public static void main(String[] args) {


        System.out.println(validate("92"));
        System.out.println(validate("1"));

        System.out.println(validate("891"));
        System.out.println(validate("123"));

    }
}