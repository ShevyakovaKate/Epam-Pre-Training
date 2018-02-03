public class BodyPartsCounter {

    private static final int HEADS_AT_BIRTH = 3;
    private static final int ONE_HUNDRED_YEARS = 100;
    private static final int TWO_HUNDRED_YEARS = 200;
    private static final int THREE_HUNDRED_YEARS = 300;
    private static final int EYES_PER_HEAD = 2;
    private static final int HEADS_FOR_MIDDLE_DRAGON = 2;
    private static final int HEAD_FOR_YOUNG_DRAGON = 3;

    public static int countHeads(int yearsOld) {
        int numberOfHeads = HEADS_AT_BIRTH;
        if (yearsOld <= TWO_HUNDRED_YEARS) {
            numberOfHeads += yearsOld * HEAD_FOR_YOUNG_DRAGON;
        } else if (yearsOld <= THREE_HUNDRED_YEARS) {
            numberOfHeads += TWO_HUNDRED_YEARS * HEAD_FOR_YOUNG_DRAGON + (yearsOld - TWO_HUNDRED_YEARS) * HEADS_FOR_MIDDLE_DRAGON;
        } else {
            numberOfHeads = TWO_HUNDRED_YEARS * HEAD_FOR_YOUNG_DRAGON
                    + ONE_HUNDRED_YEARS * HEADS_FOR_MIDDLE_DRAGON + (yearsOld - THREE_HUNDRED_YEARS);
        }
        return numberOfHeads;
    }

    public static  int countEyes(int numberOfHeads) {
         return numberOfHeads * EYES_PER_HEAD;
    }

}
