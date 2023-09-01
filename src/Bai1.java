import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int a, b, c, d, max;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        a = sc.nextInt();
        System.out.print("Nhập số nguyên b: ");
        b = sc.nextInt();
        System.out.print("Nhập số nguyên c: ");
        c = sc.nextInt();
        System.out.print("Nhập số nguyên d: ");
        d = sc.nextInt();

        max = Math.max(a, b);

        if (max <= c) {
            max = c;
        }

        if (max <= d) {
            max = d;
        }

        System.out.printf("Số lớn nhất trong 4 số là: %d", max);

    }
}
