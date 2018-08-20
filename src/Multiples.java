public class Multiples {
    public static int solution(int number) {

        int res = 0;

        for (int i = 0; i < number; i++) {
            if (i % 3 == 0) {
                res += i;
            } else if (i % 5 == 0) {
                res += i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
