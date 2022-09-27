import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        System.out.print("1st int? ");
        Scanner t = new Scanner(System.in);
        int x = t.nextInt();
        System.out.print("2nd int? ");
        Scanner k = new Scanner(System.in);
        int y = k.nextInt();

        int sum = x + y;
        int sub = x - y;
        int mul = x * y;
        int div = x / y;
        int rem = x % y;

        System.out.printf("%d + %d = %d\n", x, y, sum);
        System.out.printf("%d - %d = %d\n", x, y, sub);
        System.out.printf("%d * %d = %d\n", x, y, mul);
        System.out.printf("%d / %d = %d\n", x, y, div);
        System.out.printf("%d %% %d = %d", x, y, rem);
    }
}
