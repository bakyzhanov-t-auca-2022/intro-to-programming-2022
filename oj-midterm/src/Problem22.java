import java.util.Scanner;

public class Problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStones = scanner.nextInt();
        if (numberOfStones % 2 == 0) System.out.println("Bob");
        else System.out.println("Alice");
    }
}
