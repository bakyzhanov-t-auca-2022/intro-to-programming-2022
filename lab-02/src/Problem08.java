import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        System.out.print("Enter a number in pounds: ");
        Scanner scanner = new Scanner(System.in);
        double p = scanner.nextDouble();
        double kg = p * 0.454;

        System.out.println(p+" pounds is "+kg+" kilograms");

    }
}
