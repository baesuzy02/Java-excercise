package mang2chieu;
import java.util.*;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] a = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n; j++){
                a[i][j] = scanner.nextInt();
            }
        } int cnt = 0;
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(tn(a[i][j])){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static boolean tn (int n){
        int lat = 0 ; int tmp = n;
        while(n != 0){
         lat = lat * 10 + n % 10;
         n /= 10;
        }
        return tmp == lat;
 }
    
}
