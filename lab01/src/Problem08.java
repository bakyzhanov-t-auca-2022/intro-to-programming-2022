import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N=");
        int x = scanner.nextInt();
        int y = (x*(x+1))/2;
        System.out.println("1+2+...+N= "+y);

        int num = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i < num + 1; i++){
            sum = sum + i;
        }
        System.out.println("1+2+...+N= "+sum);
    }
}