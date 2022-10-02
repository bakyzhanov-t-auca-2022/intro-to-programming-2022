import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v = scanner.nextDouble();
        double g = -9.8;
        //y = vt + 1/2 g t^2
        //y = 0
        double t = (-2)*v / g;
        System.out.printf("%.6f",t);
    }
}
