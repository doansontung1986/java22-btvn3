import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên m: ");
        int m = sc.nextInt();
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();
        String result;

        while (m != n) {
            if (m > n) {
                m -= n;
            } else {
                n -= m;
            }
        }

        // Hai số nguyên tố cùng nhau là 2 số có UCLN là 1
        if (m == 1) {
            result = "cùng nhau";
        } else {
            result = "không cùng nhau";
        }

        System.out.printf("Hai số nguyên tố %s", result);
    }
}
