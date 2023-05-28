package contest0;

import java.util.Scanner;


public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double canhai= Math.sqrt(n);
        double canba = Math.cbrt(n);
        System.out.printf("%.2f\n",canhai);
        System.out.printf("%.3f",canba);
    }
}
