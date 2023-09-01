import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập h: ");
        int h = sc.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h * 2; j++) {
                if (j + i < h || j - i > h) {
                    System.out.print("   ");
                } else {
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }
    }
}
