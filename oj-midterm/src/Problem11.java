import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int articles = scanner.nextInt();
        int impactFactor = scanner.nextInt();

        int minNumberOfScientists = articles * impactFactor - articles + 1;
        System.out.println(minNumberOfScientists);
    }
}
