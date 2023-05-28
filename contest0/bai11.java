package contest0;

import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       long n = scanner.nextInt();
        
        System.out.printf("%d\n",n*2);
        System.out.println(" ");
        
        System.out.printf("%d\n", n*10);
        System.out.println(" ");
       
        System.out.printf("%d\n", n/2);
        System.out.println(" ");
        System.out.printf("%.3f", (double) n / 2);
    }
    
}
