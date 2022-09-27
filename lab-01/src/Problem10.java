public class Problem10 {
    public static void main(String[] args) {
        double current = 312032486;
        double second = 365*24*60*60;
        for (int i = 1; i < 6; i++){
            double birth = i * second / 7;
            double death = i * second / 13;
            double imm = i * second /45;
            double done = current + birth - death + imm;

            System.out.printf("%.0f%n",done);
        }
    }
}
