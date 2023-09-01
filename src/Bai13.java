import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        double i = 1;
        double s = 0;

        while (i <= n) {
            s += 1 / i;
            i++;
        }

        System.out.printf("S = %.8f", s);
    }
}
