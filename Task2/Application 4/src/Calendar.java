public class Calendar {

    public static int[] nextDay(int[] date) {
        int day = date[0] + 1;
        int month = date[1];
        int year = date[2];
        if (((month == 1  || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) && (day == 32)) ||
                ((month == 4 || month == 6 || month == 9 || month == 11) && (day == 31)) ||
                ((month == 2 && isLeapYear(year) && day == 30) || (month == 2 && !isLeapYear(year) && day == 29))) {
            day = 1;
            month = month + 1;
        }

        if (month == 12 && day == 32) {
            day = 1;
            month = 1;
            year += 1;
        }
        int[] dateOfNextDay = new int[]{day, month, year};
        return dateOfNextDay;
    }

    private static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
        {
            return true;
        }
        return false;
    }

}


