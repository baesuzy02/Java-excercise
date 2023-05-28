package ham;

import java.util.*;

public class bai21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int cnt = 0;
        for (int i = 1 ; i <= Math.sqrt(n); i++){
            if (nt(i)){
                cnt++;
            }
        }
        System.out.println(cnt);

    }
    public static boolean tn (int n){
        int lat = 0; int tmp =n;
        while ( n != 0){
            lat = lat * 10 + n % 10;
            n /= 10;
        }
        return lat == tmp;
    }
    public static boolean nt (int n){
        if(n < 2){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(n); i++){
            if (n % i== 0){
                return false;
            }
        }
        return true;
    }
}
