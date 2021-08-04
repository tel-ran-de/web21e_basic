public class ClassWork {
    public static void main(String[] args) {
        // testy
/*        example(4); // poedet
        example(2); // ne poedet*/
        againTwo(4);
    }

    public static void againTwo(int score) {
        if (score == 5) {
            System.out.println("велосипед");
        } else if (score == 4) {
            System.out.println("гопро");
        } else if (score == 3) {
            System.out.println("ничего");
        } else if (score == 2) {
            System.out.println("нотации");
        } else if (score == 1) {
            System.out.println("катастрофа");
        } else {
            System.out.println("Оценка не распознана");
        }
    }

    public static void example(int score) {
        if (score >= 4) {
            System.out.println("Я еду в летний лагерь");
        } else {
            System.out.println("Лагерь отменяется");
        }
    }
}
