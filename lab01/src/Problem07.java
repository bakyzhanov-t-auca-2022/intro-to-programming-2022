import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y= x*x;
        int z= x*x*x;
        int x1 = scanner.nextInt();
        int y1 = x1*x1;
        int z1=y1*x1;
        int x2 = scanner.nextInt();
        int y2 = x2*x2;
        int z2=y2*x2;
        System.out.println("a   " + "a^2    "+"a^3\n"+ x+"    "+y+"     "+z  );
        System.out.println(x1+"    "+y1+"     "+z1  );
        System.out.println(x2+"    "+y2+"     "+z2  );
    }
}