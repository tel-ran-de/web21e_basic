public class HomeSolution {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,7};
        System.out.println( getAvg(array) );
    }

    public static double getSum(int[] array) {
        double result = 0;
        for (int i: array) {
            result += i;
        }
        return result;
    }

    public static double getAvg(int[] array) {
        return getSum(array) / array.length;
    }
}
