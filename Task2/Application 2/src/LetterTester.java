public class LetterTester {

    public static void testLetterVersionOne(char letter) {
        String vowels = "AEIOUY";
        String letterString = String.valueOf(letter);
        if (vowels.contains(letterString.toUpperCase())) {
            System.out.println("The letter is vowel.");
            return;
        } else {
            System.out.println("The letter is consonant.");
            return;
        }
    }

    public static void testLetterVersionTwo(char letter) {
        char letterUpper = Character.toUpperCase(letter);
        if (letterUpper == 'A' || letterUpper == 'E' || letterUpper == 'I' || letterUpper == 'O' ||
                letterUpper == 'U' || letterUpper == 'Y') {
            System.out.println("The letter is vowel.");
            return;
        } else {
            System.out.println("The letter is consonant.");
            return;
        }
    }

    public static void testLetterVersionThree(char letter) {
        char letterUpper = Character.toUpperCase(letter);
        switch (letterUpper) {
            case 'A': {}
            case 'E': {}
            case 'I': {}
            case 'O': {}
            case 'U': {}
            case 'Y': {
                System.out.println("The letter is vowel.");
                break;
            }
            default:
                System.out.println("The letter is consonant.");

        }
    }

    public static void testLetterVersionFour(char letter) {
        char letterUpper = Character.toUpperCase(letter);
        if (letterUpper == '\u0041' || letterUpper == '\u0045' || letterUpper == '\u0049' ||
                letterUpper == '\u004F' || letterUpper == '\u0055' || letterUpper == '\u0059') {
            System.out.println("The letter is vowel.");
            return;
        } else {
            System.out.println("The letter is consonant.");
            return;
        }

    }
}
