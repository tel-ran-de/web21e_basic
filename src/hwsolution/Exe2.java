package hwsolution;

public class Exe2 {
    public static void main(String[] args) {
        System.out.println(checkAgeSaleMachine(17));
        System.out.println(checkAgeSaleMachine(21));
    }

    public static String checkAgeSaleMachine(int age) {
        String result = "";
        switch (age) {
            case 10:
                result = "Алкоголь не продаётся";
                break;
            case 17:
                result = "Пиво и сигареты можно продавать";
                break;
            case 18:
            case 20:
            case 30:
                result = "продажа разрешена";
                break;
            default:
                result = "К сожалению ваш возраст не распознан";
                break;
        }
        return result;
    }
}
