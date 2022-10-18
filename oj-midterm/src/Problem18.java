import java.util.Scanner;

public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int battery = scanner.nextInt();
        int move;

        if (x2 > x1) move = x2 - x1;
        else move = x1 - x2;

        if(y2 > y1) move = move + y2 - y1;
        else move = move + y1 - y2;

        if(move <= battery && move % 2 == 0 && battery % 2 == 0){
            System.out.println("Y");
        } else if (move <= battery && move % 2 == 1 && battery % 2 == 1){
            System.out.println("Y");
        } else System.out.println("N");
    }
}
