import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int a, b;
        int ucln = 1;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        b = sc.nextInt();

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
            }
        }

        System.out.printf("Ước chung lớn nhất là: %d\n", ucln);
        System.out.printf("Bội chung nhỏ nhất là: %d\n", (a * b) / ucln);
    }
}
