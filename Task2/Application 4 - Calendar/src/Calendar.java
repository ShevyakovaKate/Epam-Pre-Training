public class Calendar {
    private static final int FEBRUARY = 2;
    private static final int APRIL = 4;
    private static final int JUNE = 6;
    private static final int SEPTEMBER = 9;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;

    public static String nextDay(int day, int month, int year) {
        int currentDay = day;
        int currentMonth = month;
        int currentYear = year;

        if (currentMonth != DECEMBER && (currentDay == 31)) {
            currentDay = 1;
            currentMonth = currentMonth + 1;
        } else if ((currentMonth == APRIL || currentMonth == JUNE || currentMonth == SEPTEMBER || currentMonth == NOVEMBER)
                && (currentDay == 30)) {
            currentDay = 1;
            currentMonth = currentMonth + 1;
        } else if ((currentMonth == FEBRUARY && isLeapYear(currentYear) && currentDay == 29)
                || (currentMonth == FEBRUARY && !isLeapYear(currentYear) && currentDay == 28)) {
            currentDay = 1;
            currentMonth = currentMonth + 1;
        } else if (currentMonth == DECEMBER && currentDay == 31) {
            currentDay = 1;
            currentMonth = 1;
            currentYear += 1;
        } else {
            currentDay += 1;
        }
        return currentDay + "." + currentMonth + "." + currentYear;
    }

    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
}


