import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        int n = 0;
        double pi = 0;
        double x = 1.0 / (2 * n + 1);

        while (c <= x) {
            pi += Math.pow(-1, n) * x;
            n++;
            x = 1.0 / (2 * n + 1);
        }

        pi *= 4;

        System.out.println("PI = " + pi);
    }
}
