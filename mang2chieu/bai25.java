package mang2chieu;
import java.util.*;
public class bai25 {
    public static int cnt = 0;
    public static int dx[] = {-1,0,1,0};
    public static int dy[] = {0,1,0,-1};
    public static boolean [][] used = new boolean[500][500];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [][]a = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = scanner.nextInt();
                if(a[i][j] == 0){
                   used[i][j] = true;
                }
            }
            
        }
        int maxn = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m; j++){
                cnt = 0;
                if(!used[i][j]){
                    dfs(i,j,n,m);
                    maxn = Math.max(maxn,cnt);
                }
            }
        }
        System.out.println(maxn);

    }
    public static void dfs (int i , int j , int n , int m){
        cnt++;
        used[i][j] = true;
        for(int k = 0; k < 4 ; k++){
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if(i1 >= 0 && i1 < n && j1 >= 0 && j1 < m && !used[i1][j1]){
                dfs(i1,j1,n,m);
            }
        }
    }
}
