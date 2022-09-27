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

        System.out.println(x + " + " + y + " = " + sum);
        System.out.println(x + " - " + y + " = " + sub);
        System.out.println(x + " * " + y + " = " + mul);
        System.out.println(x + " / " + y + " = " + div);
        System.out.println(x + " % " + y + " = " + rem);
    }
}
