import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        System.out.print("1st double? ");
        Scanner t = new Scanner(System.in);
        double x = t.nextDouble();
        System.out.print("2nd double? ");
        Scanner k = new Scanner(System.in);
        double y = k.nextDouble();
        double sum = x+y;
        double sub = x-y;
        double mul = x*y;
        double div = x/y;
        double rem = x%y;
        System.out.printf("%d + %d = %d\n", x, y, sum);
        System.out.printf("%d - %d = %d\n", x, y, sub);
        System.out.printf("%d * %d = %d\n", x, y, mul);
        System.out.printf("%d / %d = %d\n", x, y, div);
        System.out.printf("%d %% %d = %d", x, y, rem);

    }
}
