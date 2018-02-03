public class Main {

    public static void main(String[] args) {
        int yearsOld = 300;
        int numberOfHead = BodyPartsCounter.countHeads(yearsOld);
        int numberOfEyes = BodyPartsCounter.countEyes(numberOfHead);
        System.out.println("The dragon has " + numberOfHead + " heads and "
                + numberOfEyes + " eyes.");

    }
}
