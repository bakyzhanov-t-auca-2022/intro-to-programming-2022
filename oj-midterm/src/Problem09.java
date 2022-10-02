import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double h = scanner.nextDouble();
        double V = Math.PI *r *r *h / 3;
        System.out.printf("%.2f",V);
    }
}
