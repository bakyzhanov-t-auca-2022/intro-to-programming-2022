import java.util.Scanner;
public class Problem01{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1st value? ");
        int a = scanner.nextInt();
        System.out.print("2nd value? ");
        int b = scanner.nextInt();
        System.out.printf("Before swapping: a = %d; b = %d;%n", a, b);
        int t = a;
        a = b;
        b = t;
        System.out.printf("After swapping: a = %d; b = %d;" , a, b);
    }
}