public class Main {

    public static void main(String[] args) {
        char letter = 'y';
        System.out.print("Test 1: ");
        if (LetterTester.isVowelLetterIfDesigned(letter)) {
            System.out.println("The letter is vowel.");
        } else {
            System.out.println("The letter is consonant");
        }
        System.out.print("Test 2: ");
        if (LetterTester.isVowelLetterSwitchDesigned(letter)) {
            System.out.println("The letter is vowel.");
        } else {
            System.out.println("The letter is consonant");
        }
        System.out.print("Test 3: ");
        if (LetterTester.isVowelLetterAsciiDesigned(letter)) {
            System.out.println("The letter is vowel.");
        } else {
            System.out.println("The letter is consonant");
        }
        System.out.print("Test 4: ");
        if (LetterTester.isVowelLetterUnicodeDesigned(letter)) {
            System.out.println("The letter is vowel.");
        } else {
            System.out.println("The letter is consonant");
        }
        System.out.print("Test 5: ");
        if (LetterTester.isVowelLetterContainsDesigned(letter)) {
            System.out.println("The letter is vowel.");
        } else {
            System.out.println("The letter is consonant");
        }
    }
}
