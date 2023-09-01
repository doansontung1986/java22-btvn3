import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        int n;
        int s = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        n = sc.nextInt();

        for (int i = 7; i <= n; i += 7) {
            System.out.printf("%d ", i);
            s += i;
        }

        System.out.printf("\nTổng các số tự nhiên không lớn hơn n và chia hết cho 7 là S = %d\n", s);
    }
}
