import java.util.Arrays;

public class Xbonacci {
    public static double[] tribonacci(double[] s, int n) {
        double[] mybonnacci = new double[n];
        if (n == 0) {

        } else if (n < 3) {
            System.arraycopy(s, 0, mybonnacci, 0, n);
        } else {
            System.arraycopy(s, 0, mybonnacci, 0, s.length);
            for (int i = 0; i < mybonnacci.length - 3; i++) {
                mybonnacci[i + 3] = mybonnacci[i] + mybonnacci[i + 1] + mybonnacci[i + 2];
            }
        }
        return mybonnacci;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 0, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 10)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 0)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 1)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 2)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 3)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 0.5, 1}, 4)));
    }
}
