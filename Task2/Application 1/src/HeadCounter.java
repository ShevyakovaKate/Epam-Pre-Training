public class HeadCounter {

    public static int countHeads(int yearsOld) {
        int numberOfHeads = 3;
        if (yearsOld <= 200) {
            numberOfHeads += yearsOld * 3;
        } else if (yearsOld <= 300) {
            numberOfHeads += 600 + (yearsOld - 200) * 2;
        } else {
            numberOfHeads += 800 + (yearsOld - 300);
        }
        return numberOfHeads;
    }

    public static  int countEyes(int yearsOld) {
         return countHeads(yearsOld) * 2;
    }

}
