import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        System.out.print("Enter the number of minutes: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();

        int y = m / 525600;
        int d = (m - (y*525600)) /1440;
        System.out.printf("%d minutes is approximately %d years and %d days",m,y,d);
    }
}
