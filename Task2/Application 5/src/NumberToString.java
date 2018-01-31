public class NumberToString {

    public static String convertNumberToString(int number) {
        String numberAtString = "";
        if (number == 0) {
            numberAtString += "zero";
        } else if (number < 10) {
            numberAtString += oneDigitToString(number);
        } else if (number < 100) {
            numberAtString += twoDigitToString(number);
        } else {
            numberAtString += threeDigitToString(number);
        }
        return numberAtString;
    }

    private static String oneDigitToString(int number) {
        String numberAsString = "";
        if (number == 1) {
            numberAsString = "one ";
        }
        if (number == 2) {
            numberAsString = "two ";
        }
        if (number == 3) {
            numberAsString = "three ";
        }
        if (number == 4) {
            numberAsString = "four ";
        }
        if (number == 5) {
            numberAsString = "five ";
        }
        if (number == 6) {
            numberAsString = "six ";
        }
        if (number == 7) {
            numberAsString = "seven ";
        }
        if (number == 8) {
            numberAsString = "eight ";
        }
        if (number == 9) {
            numberAsString = "nine ";
        }
        return numberAsString;
    }

    private static String twoDigitToString(int number) {
        String numberAsString = "";
        if (number < 10) {
            numberAsString += oneDigitToString(number);
        }
        if (number >= 20) {
            numberAsString += dozenToString((number % 100) / 10) + oneDigitToString(number % 10);
        }
        if (number > 9 && number < 20) {
            if (number == 10) {
                numberAsString += "ten ";
            }
            if (number == 11) {
                numberAsString += "eleven ";
            }
            if  (number == 12) {
                numberAsString += "twelve ";
            }
            if (number == 13) {
                numberAsString += "thirteen ";
            }
            if (number == 14) {
                numberAsString += "fourteen ";
            }
            if (number == 15) {
                numberAsString += "fifteen ";
            }
            if (number == 16) {
                numberAsString += "sixteen ";
            }
            if (number == 17) {
                numberAsString += "seventeen ";
            }
            if (number == 18) {
                numberAsString += "eighteen ";
            }
            if (number == 19) {
                numberAsString += "nineteen ";
            }
        }
        return numberAsString;

    }

    private static String dozenToString(int number) {
        String numberAsString = "";
        if (number == 2) {
            numberAsString += "twenty ";
        }
        if  (number == 3) {
            numberAsString += "thirty ";
        }
        if (number == 4) {
            numberAsString += "forty ";
        }
        if (number == 5) {
            numberAsString += "fifty ";
        }
        if (number == 6) {
            numberAsString += "sixty ";
        }
        if (number == 7) {
            numberAsString += "seventy ";
        }
        if (number == 8) {
            numberAsString += "eighty ";
        }
        if (number == 9) {
            numberAsString += "ninety ";
        }
        return numberAsString;
    }

    private static String threeDigitToString(int number) {
        String numberAsString = "";
        if (number / 100 == 1) {
            numberAsString += oneDigitToString(number/100) + "hundred ";
        } else {
            numberAsString += oneDigitToString(number/100) + "hundreds ";
        }
        if (number % 10 == 0) {
            numberAsString += twoDigitToString(((number % 100) / 10) * 10);
        } else {
            numberAsString += twoDigitToString((((number % 100) / 10) * 10) + (number % 10));
        }
        return numberAsString;

    }
}
