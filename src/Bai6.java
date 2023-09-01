import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int originalNumber, tempNumber;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số: ");
        originalNumber = sc.nextInt();
        tempNumber = originalNumber;

        while (tempNumber > 0) {
            sum += tempNumber % 10;
            tempNumber /= 10;
        }

        System.out.printf("Tổng các chữ số của %d là: %d", originalNumber, sum);
    }
}
