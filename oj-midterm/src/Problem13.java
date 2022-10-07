import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();

        int firstDigit1 = num1 / 100, secondDigit1 = num1 / 10 % 10, thirdDigit1 = num1 % 100 % 10;
        int firstDigit2 = num2 / 100, secondDigit2 = num2 / 10 % 10, thirdDigit2 = num2 % 100 % 10;
        int numReversed1 = firstDigit1 + secondDigit1 * 10 + thirdDigit1 * 100;
        int numReversed2 = firstDigit2 + secondDigit2 * 10 + thirdDigit2 * 100;
        int numMaxReversed = Math.max(numReversed2, numReversed1);
        System.out.println(numMaxReversed);
    }
}
