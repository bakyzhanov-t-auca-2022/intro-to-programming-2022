public class Problem10 {
    public static void main(String[] args) {
        int current = 312032486;
        int second = 365*24*60*60;
        for (int i = 1; i < 6; i++){
            int birth = i * second / 7;
            int death = i * second / 13;
            int imm = i * second /45;
            int done = current + birth - death + imm;

            System.out.printf("%d%n",done);
        }
    }
}
