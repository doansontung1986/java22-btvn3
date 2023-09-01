import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int count = 0;

        System.out.println("Các ước số của n là: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d ", i);
                count++;
            }
        }

        System.out.printf("Có tổng cộng %d ước số.", count);
    }
}
