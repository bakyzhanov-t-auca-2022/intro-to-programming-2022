import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st number? ");
        int num1 = scanner.nextInt();
        System.out.print("2nd number? ");
        int num2 = scanner.nextInt();
        System.out.print("3rd number? ");
        int num3 = scanner.nextInt();
        int maxValue = num1;

        if (num2 > maxValue) maxValue = num2;
        if (num3 > maxValue) maxValue = num3;

        System.out.println("The value " + maxValue + " is the greatest one.");
    }
}
