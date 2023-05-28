package ham;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        pt(n);
    }
    public static void pt (long n){
        for(int i = 2; i <= Math.sqrt(n) ; i++){
            if (n % i == 0){
                int mu = 0;
                while (n % i == 0){
                      mu++;
                      n /= i;
                }
                System.out.println(i + "^" + mu);
                if ( n != 0){
                    System.out.println(" * ");
                }
            }
        }
        if ( n != 0){
            System.out.println(n + "^1");
        }

    }
    
}
