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
        System.out.println("x+y= " + sum + "\nx-y=" + sub + "\nx*y=" + mul + "\nx/y=" + div );
    }
}
