import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int w = scanner.nextInt();
        int tile = scanner.nextInt();
        w = w/tile;
        l = l/tile;
        int ans = w*l;
        System.out.println(ans);

    }
}
