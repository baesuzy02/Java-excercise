package contest0;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a =  scanner.nextInt();
        long b = scanner.nextInt();
        long c =  scanner.nextInt();
        int d =  scanner.nextInt();
        long tong = a+b+c+d;
        long S = a-b+c*d;
        System.out.println(b+","+c+","+a+","+d);
        System.out.println(tong);
        System.out.println(S);
    }
    
}
