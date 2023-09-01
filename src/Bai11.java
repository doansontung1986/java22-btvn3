import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        int n;
        int s = 0, s1 = 0, s2 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            s += i;
            if (i % 2 != 0) {
                s1 += i;
            } else {
                s2 += i;
            }
        }

        System.out.printf("Tổng các số tự nhiên không lớn hơn n là S = %d\n", s);
        System.out.printf("Tổng các số tự nhiên lẻ không lớn hơn n là S = %d\n", s1);
        System.out.printf("Tổng các số tự nhiên chẵn không lớn hơn n là S = %d\n", s2);
    }
}
