public class MyLovelySwitch {
    public static void main(String[] args) {
        /*
        * Пример:
    За пятёрку в четверти по математике папа обещал мне велосипед.
    За четвёрку в четверти по математике мама купит мне GoPro4.
    За тройку меня, наверное, не будут ругать.
    За двойку меня отругают.
    За единицу мы даже не будем думать”.
    * */
        againTwo(3);
        System.out.println("---------");
        againTwo(10);
    }

    public static void againTwo(int score) {
        String награда = "";

        switch (score) {
            case 5:
                награда = "Велосипед";
                break;
            case 4:
                награда = "Gopro6";
                break;
            case 3:
                награда = "Награды не будет";
                break;
            case 2:
                награда = "Нотации";
                break;
            case 1:
                награда = "лучше не спрашивайте";
                break;
            default:
                награда = "Такой оценки не существует";
                break;
        }
        System.out.println(награда);
    }
}
