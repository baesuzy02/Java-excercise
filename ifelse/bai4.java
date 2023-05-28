package ifelse;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double chuVi= 2 * r * 3.14;
        double dienTich = r*r*3.14;
        System.out.printf("%.4f\t",chuVi);
        System.out.printf("%.4f",dienTich);
    }
}
