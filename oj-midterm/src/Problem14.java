import java.util.Scanner;
import java.lang.Math;

public class Problem14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int v = scanner.nextInt();

        double radian = Math.toRadians(v);
        double sin = Math.sin(radian);

        double result = Math.ceil(height / sin);
        System.out.printf("%.0f", result);
    }
}
