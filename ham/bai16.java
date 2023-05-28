package ham;

import java.util.*;

public class bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        for (int i = a ; i <= b ;i++){
            if (tn(i) && check6(i) && check8(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static boolean tn ( int n){
        int lat = 0; int tmp = n;
        while (n != 0){
            lat = lat * 10 + n % 10;
            n  /= 10;
        }
        return lat == tmp;
    }
    public static boolean check6( int n){
        while (n!=0){
            int r = n % 10;
            if (r==6){
                return true;
            }
            n /= 10;
        }
        return false;
    }
    public static boolean check8(int n){
        int sum = 0;
        while ( n != 0){
            sum += n % 10;
            n /= 10;
        } if ( sum % 10 == 8){
            return true;
        } else {
            return false;
        }
    }
}
