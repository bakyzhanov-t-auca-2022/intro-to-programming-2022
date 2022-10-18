import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number / 10000 == 555) System.out.println(1);
        else System.out.println(0);
    }

}
