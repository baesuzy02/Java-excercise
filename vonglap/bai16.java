package vonglap;

import java.util.Scanner;

public class bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum = 1;
        for ( int i = 1 ; i <= n; i++){
            sum*=i;
        }
        System.out.println(sum);
    }
    
}
