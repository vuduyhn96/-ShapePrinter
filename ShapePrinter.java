import java.util.Scanner;

public class ShapePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            // Hiển thị menu
            System.out.println("Menu:");
            System.out.println("1 .In hình chữ nhật");
            System.out.println("2.  hình tam giác");
            System.out.println("3.  tam giác cân");

            // Nhập lựa chọn từ người dùng
            System.out.print("Nhập lựa chọn : ");
            int a = scanner.nextInt();

            // Xử lý lựa chọn
            switch (a) {
                case 1:
                    printRectangle();
                    break;
                case 2:
                    printSquareTriangle();
                    break;
                case 3:
                    printIsoscelesTriangle();
                    break;
            }
    }
    // Phương thức in hình chữ nhật
    private static void printRectangle() {
        int width = 20;
        int height = 5;
// dùng vòng lặp lồng nhau
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Phương thức in hình tam giác vuông
    private static void printSquareTriangle() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // Phương thức in hình tam giác cân
    private static void printIsoscelesTriangle() {
        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
