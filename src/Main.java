import java.util.Scanner;
public class chapter1_challenge1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the cryptic message (a positive integer): ");
        int message = input.nextInt();
        int digits = (int) Math.log10(message) + 1;
        int firstDigit = (int) (message / Math.pow(10, digits - 1));
        int lastDigit = message % 10;
        int secondDigit = (int) (message / Math.pow(10, digits - 2)) % 10;
        int secondLastDigit = (message / 10) % 10;
        int product = firstDigit * lastDigit;
        int sum = secondDigit + secondLastDigit;
        String finalCode = product + "" + sum;
        System.out.println("The decrypted code is: " + finalCode);


    }
}
