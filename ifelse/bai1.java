package ifelse;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextInt();
        long A = (long)x*x*x + 3*x*x + x + 1;
        System.out.println(A);
    }
    
}
