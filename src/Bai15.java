import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        int n;
        int s = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập n: ");
        n = sc.nextInt();

        System.out.println("Các số chẵn nhỏ hơn n");
        for (int i = 0; i < n; i += 2) {
            System.out.printf("%d ", i);
        }

        System.out.println();

        System.out.println("Các số lẻ nhỏ hơn n");
        for (int i = 1; i < n; i += 2) {
            System.out.printf("%d ", i);
        }
    }
}
