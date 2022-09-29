import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double h = scanner.nextDouble();
        double b = scanner.nextDouble();

                if (h>=1 & h<=1000 & b>=1 & b<=1000) {
                    double area = h * b / 2;
                    System.out.println(area);
                }
    }
}
