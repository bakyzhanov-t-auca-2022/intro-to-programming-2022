import java.util.Scanner;

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int Q = scanner.nextInt();
        int L = scanner.nextInt();
        int T = scanner.nextInt();

        int sum = 5 * N + D * 10 + Q * 25 + L * 100 + T * 200;
        System.out.println(sum);
    }
}
