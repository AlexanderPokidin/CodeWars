public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
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
}
