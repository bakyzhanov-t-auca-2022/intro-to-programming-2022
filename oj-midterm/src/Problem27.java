import java.util.Scanner;

public class Problem27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int C = scanner.nextInt();
        if (W == 3 && C > 94) System.out.println("C.C. is absolutely satisfied with her pizza.");
        else if (W == 1 && C < 51) System.out.println("C.C. is fairly satisfied with her pizza.");
        else System.out.println("C.C. is very satisfied with her pizza.");
    }
}
