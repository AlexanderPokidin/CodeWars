public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {

        if (h > 0 && (bounce > 0 && bounce < 1) && window < h) {
            int count = 1;
            for (; h * bounce > window; h = h * bounce) {
                count += 2;
            }
            return count;

        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(bouncingBall(3.0, 0.66, 1.5));
        System.out.println(bouncingBall(30.0, 0.66, 1.5));
    }
}
