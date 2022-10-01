import java.util.Scanner;

public class Problem05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int S = scanner.nextInt();
        int L = R*8+S*3-28;
        System.out.println(L);
    }
}
