package vonglap;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        int can = (int) Math.sqrt(n);
        for (int i = 1; i <= Math.sqrt(n); i++){
            System.out.print(1l*i*i + " ");
        }

        
    }
    
}
