public class HomeWorkSolution {


    public static void main(String[] args) {
         /*
    Маша выдает в месяц 50 кредитов.Петя выдает на 20% меньше кредитов чем Маша.
    Вася в хорошем настроении выдает столько же сколько и Маша.
    В плохом настроении выдает в два раза меньше,чемМаша.
    У Василия настроение улучшается только послетого,как будет выдано в общем больше,чем 1370 кредитов.
    Пока выдано меньше, настроение у Васиплохое.
    Вопрос:
    1.сколько месяцев понадобится, чтобы выдать в общем 2100 кредитов.
    2.сколько кредитовбудет выдано в общем за 16 месяца.
     */

        double masha = 50;
        int targetCreditSum = 2100;
        int monthForWork = 16;

        sumByMonth(masha, targetCreditSum);
        monthBySum(masha, monthForWork);
    }

    private static void monthBySum(double masha, int monthForWork) {

        double creditSum = 0;
        int month = 1;

        while (month <= monthForWork) {
            month++;
            creditSum += masha + getPetrCredit(masha) + getVasyaCredit(masha, creditSum);
        }
        System.out.println(creditSum);
    }

    public static void sumByMonth(double masha, int targetCreditSum) {

        double creditSum = 0;
        int month = 1;

        while (creditSum <= targetCreditSum) {
            month++;
            creditSum += masha + getPetrCredit(masha) + getVasyaCredit(masha, creditSum);
        }
        System.out.println(month);
    }

    public static double getPetrCredit (double masha) {
        return masha - masha * 0.2;
    }

    public static double getVasyaCredit (double masha, double creditSum ) {
        return (creditSum > 1370) ? masha : masha * 0.5;
    }

}
