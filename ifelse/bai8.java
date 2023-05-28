package ifelse;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int tong = a + b;
        int hieu = a - b;
        long tich = a * b ;
        double thuong = (double)a / b;
        System.out.println(tong);
        System.out.println(hieu);
        System.out.println(tich);
        if ( b == 0 ) {
            System.out.printf("INVALID\n");
        }else {
            System.out.printf("%.4f", thuong);
        }
    }
    
}
