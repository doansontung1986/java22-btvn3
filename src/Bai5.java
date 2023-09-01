import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        int originalNumber, tempNumber;
        int reversedNumber = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số: ");
        originalNumber = sc.nextInt();
        tempNumber = originalNumber;
        String result;

        while (tempNumber > 0) {
            reversedNumber = reversedNumber * 10 + tempNumber % 10;
            tempNumber /= 10;
        }

        if (originalNumber != reversedNumber) {
            result = "không phải là";
        } else {
            result = "là";
        }

        System.out.printf("%d %s số thuận nghịch", originalNumber, result);
    }
}
