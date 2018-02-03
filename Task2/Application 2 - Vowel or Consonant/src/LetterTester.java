public class LetterTester {

    public static boolean isVowelLetterIfDesigned(char letter) {
        char letterUpper = Character.toUpperCase(letter);
        if (letterUpper == 'A' || letterUpper == 'E' || letterUpper == 'I' || letterUpper == 'O' ||
                letterUpper == 'U' || letterUpper == 'Y') {
            return true;
        }
        return false;
    }

    public static boolean isVowelLetterSwitchDesigned(char letter) {
        char letterUpper = Character.toUpperCase(letter);
        switch (letterUpper) {
            case 'A': {}
            case 'E': {}
            case 'I': {}
            case 'O': {}
            case 'U': {}
            case 'Y': {
                return true;
            }
            default:
                return false;
        }
    }

    public static boolean isVowelLetterUnicodeDesigned(char letter) {
        char letterUpper = Character.toUpperCase(letter);
        if (letterUpper == '\u0041' || letterUpper == '\u0045' || letterUpper == '\u0049' ||
                letterUpper == '\u004F' || letterUpper == '\u0055' || letterUpper == '\u0059') {
            return true;
        }
        return false;
    }

    public static boolean isVowelLetterAsciiDesigned(char letter) {
        char letterUpper = Character.toUpperCase(letter);
        if (letterUpper == 65 || letterUpper == 69 || letterUpper == 73 ||
                letterUpper == 79 || letterUpper == 85 || letterUpper == 89) {
            return true;
        }
        return false;
    }

     public static boolean isVowelLetterContainsDesigned(char letter) {
        String vowels = "AEIOUY";
        String letterString = String.valueOf(letter);
        String letterStringUpper = letterString.toUpperCase();
        if (vowels.contains(letterStringUpper)) {
            return true;
        }
        return false;
    }
}
