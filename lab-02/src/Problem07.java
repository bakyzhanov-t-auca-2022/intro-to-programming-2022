import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double r = scanner.nextDouble();
        double l = scanner.nextDouble();
        double A = r*r*Math.PI;
        System.out.printf("The area is %.4f%n",A);
        double V = A*l;
        System.out.printf("The volume is %.1f",V);

    }
}
