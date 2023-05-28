package ham;

import java.util.*;


public class bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        if ( n >= 2){
              System.out.print(2 + " ");
              cnt++;
        }
        for (int i = 3 ; i <= n;i+=2){
            if (check(i) && nt(i)){
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println("\n" + cnt);
    }
    public static boolean nt (int n){
        if ( n < 2){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(n) ; i++){
            if ( n% i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean check (int n){
        int max = n % 10;
        n/=10;
        while (n != 0){
            if ( n % 10 > max){
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
