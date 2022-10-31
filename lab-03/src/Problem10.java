import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double coor1 = scanner.nextInt();
        double coor2 = scanner.nextInt();
        double centerPoint = Math.sqrt(coor1 * coor1 + coor2 * coor2);
        if (centerPoint > 10) {
            System.out.printf("Point (%.1f, %.1f) is not in the circle", coor1, coor2);
        }
        if (centerPoint <= 10) {
            System.out.printf("Point (%.1f, %.1f) is in the circle", coor1, coor2);
        }
    }
}
