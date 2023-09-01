import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int m, n;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        n = sc.nextInt();

        System.out.print("Nhập m: ");
        m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
