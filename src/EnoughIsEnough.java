import java.util.ArrayList;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < elements.length; i++) {
            result.add(elements[i]);
        }

        for (int i = 0; i < result.size(); i++) {
            int count = 0;
            for (int j = i; j < result.size(); j++) {
                if (result.get(i).equals(result.get(j))) {
                    count++;
                    if (count > maxOccurrences) {
                        result.remove(j);
                    }
                }
            }
        }

        int[] resArray = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            resArray[i] = result.get(i);
        }
        return resArray;
    }

    public static void main(String[] args) {

        int[] testArray = deleteNth(new int[]{20, 37, 20, 21}, 1);

        for (int i = 0; i < testArray.length; i++) {
            System.out.println(testArray[i]);
        }
    }
}