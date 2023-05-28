package mang2chieu;
import java.util.*;
public class bai18 {
    public static int dx[] = {-1,-1,-1,0,1,1,1,0};
    public static int dy[] = {-1,0,1,1,1,0,-1,-1};
    public static boolean check(int a[][], int i , int j,int n, int m){
        for(int k = 0; k < 8 ; k++){
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if(i1 >= 0 && i1 < n && j1 >= 0 && j1 < m){
                if(a[i][j] <= a[i1][j1]){
                    return false;
                }
            }
        }
        return true;
    }
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][] a = new int[n][m];
        for(int i = 0; i < n; i++){
           for(int j = 0 ; j < m ;j++){
            a[i][j] = scanner.nextInt();
           }
        }
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(check(a,i,j,n,m)){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    
}
