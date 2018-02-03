import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("***The name of a number as a string***");
        System.out.print("Input number: ");
        Scanner reader = new Scanner(System.in);
        int input = reader.nextInt();
        reader.close();
        System.out.println("The number as a string: " + NumberToString.convertNumberToString(input));
    }
}
