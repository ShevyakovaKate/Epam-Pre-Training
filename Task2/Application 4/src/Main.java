public class Main {

    public static void main(String[] args) {
        int[] date = {28, 2, 2000};
        int[] nextDay = Calendar.nextDay(date);
        System.out.println(new Integer(nextDay[0]).toString() + "." + new Integer(nextDay[1]).toString() + "." +
                new Integer(nextDay[2]).toString());

    }
}
