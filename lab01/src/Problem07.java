

public class Problem07 {
    public static void main(String[] args) {
        System.out.printf("%-5s%-6s%-6s%n","a","a^2","a^3");
        for (int i = 1 ; i < 5; i++ ) {
            System.out.printf("%-5d%-6d%-6d%n", i, i * i, i * i * i);
        }
    }
}