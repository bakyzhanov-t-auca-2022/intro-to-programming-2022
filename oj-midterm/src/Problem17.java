import java.util.Scanner;

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int small = scanner.nextInt();
        int medium = scanner.nextInt();
        int large = scanner.nextInt();

        int happiness = small + 2 * medium + 3 * large;
        if(happiness<9) System.out.println("sad");
        else System.out.println("happy");
    }
}
