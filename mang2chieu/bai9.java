package mang2chieu;
import java.util.*;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(nt (a[i][i])){
                cnt++;
            }
            if(nt(a[i][n - i -1])){
                cnt++;
            }
        }
        if( n % 2 == 1){
            if(nt(a[n/2][n/2])){
                cnt--;
            }
        }
        System.out.println(cnt);
    }
    public static boolean nt (int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
