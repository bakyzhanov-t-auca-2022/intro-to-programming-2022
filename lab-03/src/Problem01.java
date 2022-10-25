import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("some real number? ");
        double num = scanner.nextDouble();
        if (num < 0) System.out.printf("|%f| = %f", num, -num);
        else System.out.printf("|%f| = %f", num, num);
    }
}
