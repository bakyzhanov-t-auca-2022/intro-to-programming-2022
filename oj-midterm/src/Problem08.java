import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int m = scanner.nextInt();
        int Jack_O = n*t*m;
        System.out.println(Jack_O);
    }
}
