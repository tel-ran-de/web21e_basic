public class BodyMassIndex {

    public static void findBodyMassIndex(double height,
                                         double weight) {
        height = height / 100;
        double bmi = weight / (height * height);
        System.out.println(bmi);
    }

    // Почему при делении 100 на 175 я получил ноль
    public static void main(String[] args) {
        double heightUserVova, weightUserVova;
        heightUserVova = 175;
        weightUserVova = 100;
        findBodyMassIndex(heightUserVova, weightUserVova);

        double heightSveta = 165;
        double weightSveta = 65;
        findBodyMassIndex(heightSveta, weightSveta);
    }
}
