import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int tile = scanner.nextInt();

        int answer = (width / tile) * (length / tile);

        System.out.println(answer);

    }
}
