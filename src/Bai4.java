import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();
        int count = 0;
        int i = 2;
        boolean isPrime = true;

        System.out.printf("%d số nguyên tố đầu tiên là: ", n);

        while (count < n) {

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }

            if (isPrime) {
                System.out.printf("%d ", i);
                count++;
            }

            i++;
        }

    }
}
