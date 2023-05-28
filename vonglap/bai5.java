package vonglap;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       long n = scanner.nextInt();
        double sum = 0;
        for ( int i = 1; i <= n; i++){
            sum+= 1.0/(2*i);
        } System.out.printf("%.5f", sum);
    }
    
}
