package mang2chieu;
import java.util.*;
public class bai20 {
    public static int dx[] = {-1,0,1,0};
    public static int dy[] = {0,1,0,-1};
    public static boolean [][]used = new boolean[100][100];
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        u--;v--;s--;t--;
        int [][]a = new int[n][m];
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < m;j++){
                a[i][j] = scanner.nextInt();
                if(a[i][j] == 0){
                    used[i][j] = true;
                }
            }
        }
        dfs(u,v,n,m);
        if(!used[s][t]){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
    public static void dfs(int i , int j, int n, int m){
        used[i][j]  = true;
        for(int k = 0 ; k < 4; k++){
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if(i1 < n && i1 >= 0 && j1 < m && j1 >= 0 && !used[i1][j1]){
                dfs(i1,j1,n,m);
            }
        }
    }
    
}
