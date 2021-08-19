import java.util.Arrays;

public class HomeSolution {
    public static void main(String[] args) {
        int [] array = new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(getParOfIndexes(array)));
    }

    public static int[] getParOfIndexes(int [] array) {
        int[] result = new int []{array[0], array[1]};
        int sum = array[0]+array[1];

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] + array[j] > sum) {
                    sum = array[i] + array[j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
