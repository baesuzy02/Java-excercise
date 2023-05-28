package mang2chieu;
import java.util.*;
public class bai16 {
    static int n, m;
    static int [] dx = {-1,0,1,0};
    static int [] dy = {0,-1,0,1};
    static int [][] a = new int [100][100];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         n = scanner.nextInt();
         m = scanner.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        int cnt = 0;
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < m; j++){
                if(a[i][j] == 1){
                    cnt++;
                    loang(i,j);
                }
            }
        }
        System.out.println(cnt);
    }
    public static void loang(int i, int j){
        a[i][j] = 0;
        for(int k = 0; k < 4 ; k++){
              int i1 = i + dx[k];
              int j1 = j + dy[k];
              if( i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && a[i1][j1] == 1){
                loang(i1,j1);
              }
        }
    }
    
}
