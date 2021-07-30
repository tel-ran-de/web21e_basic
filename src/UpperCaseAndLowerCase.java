import java.util.Locale;

public class UpperCaseAndLowerCase {
    public static void main(String[] args) {
        String articleTitle = "london is the capital of great britain";
        String homepageTitle = articleTitle.toUpperCase();
        System.out.println(homepageTitle);
        articleTitle = articleTitle.substring(0, 1).toUpperCase() +
                articleTitle.substring(1).toLowerCase();
        System.out.println(articleTitle);
        // length()
        // toUpperCase()
        //toLowerCase()

        String strNumber = "25";
        int newNumber = Integer.parseInt(strNumber);
        newNumber = newNumber + 3;
        System.out.println(newNumber);
        System.out.println(strNumber + 3);
    }
}
