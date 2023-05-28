package contest0;

import java.util.Scanner;

public class bai12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long y = scanner.nextInt();
        long s = 5*x + 2*y +x*y;
        System.out.println(s);
    }
    
}
