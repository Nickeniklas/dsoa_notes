public class CircArr {

    int today;

    public static String CircArrWeekDays(int today) {
        String[] weekDays = { "må", "ti", "on", "to", "fr", "lö", "sö" };
        int n = today % weekDays.length;
        return weekDays[n];
    }
}
