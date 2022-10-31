import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) System.out.println("The equation has no real roots");
        if (discriminant > 0) {
            double r1 = ((-1) * b + Math.sqrt(discriminant)) / 2 * a;
            double r2 = ((-1) * b - Math.sqrt(discriminant)) / 2 * a;
            System.out.printf("The equation has two roots %.4f and %.4f", r1, r2);
        }
        if (discriminant == 0) {
            double root = ((-1) * b) / 2 * a;
            System.out.printf("The equation has one root %.4f", root);
        }
    }
}
