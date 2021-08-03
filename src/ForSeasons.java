public class ForSeasons {
    public static void main(String[] args) {
        System.out.println(findSeason(5));
    }

    public static String findSeason(int monthNumber) {
        //winter, spring, summer, fall
        String resultSeason = "";
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                resultSeason = "winter";
                break;
            case 3:
            case 4:
            case 5:
                resultSeason = "spring";
                break;
            case 6:
            case 7:
            case 8:
                resultSeason = "summer";
                break;
            case 9:
            case 10:
            case 11:
                resultSeason = "fall";
                break;
            default:
                resultSeason = "not valid month";
                break;
        }
        return resultSeason;
    }
}
