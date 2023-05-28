package mang2chieu;
import java.util.*;
public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] a = new int[n][n];
        HashSet <Integer> se = new HashSet<>();
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n ; j++){
                a[i][j] = scanner.nextInt();
                if( (i == j || j == n - i - 1)&&nt(a[i][j]))
                       se.add(a[i][j]);   
            } 
        }
        System.out.println(se.size());
    }
    public static boolean nt (int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    
}
