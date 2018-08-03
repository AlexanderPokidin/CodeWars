import java.util.ArrayList;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        if (elements.length == 0){
            return elements;
        } else {
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


    }

    public static void main(String[] args) {

        int[] testArray = deleteNth(new int[]{20, 37, 20, 21}, 1);
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i]);
            System.out.print(" ");
        }
        System.out.println("");

        int[] testArray2 = deleteNth(new int[]{ 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3);
        for (int i = 0; i < testArray2.length; i++) {
            System.out.print(testArray2[i]);
            System.out.print(" ");
        }
        System.out.println("");

        int[] testArray3 = deleteNth(new int[]{ }, 5);
        for (int i = 0; i < testArray3.length; i++) {
            System.out.print(testArray3[i]);
            System.out.print(" ");
        }
        System.out.println("");
    }
}