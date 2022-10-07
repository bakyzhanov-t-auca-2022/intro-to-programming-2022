import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int twoDigit = scanner.nextInt();

        int firstDigit = twoDigit / 10, secondDigit = twoDigit % 10;
        int twoDigitSwapped = secondDigit * 10 + firstDigit;
        System.out.println(twoDigitSwapped);
    }
}
