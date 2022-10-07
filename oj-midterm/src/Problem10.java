import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double velocity = scanner.nextDouble();
        double gravitation = -9.8;
        //y = vt + 1/2 g t^2
        //y = 0
        double time = (-2) * velocity / gravitation;
        System.out.printf("%.6f", time);
    }
}
