package mang2chieu;
import java.util.*;
public class bai21 {
    public static int dx[] = {-1,-2,-2,-1,1,2,2,1};
    public static int dy[] = {-2,-1,1,2,2,1,-1,-2};

    public static boolean [][] used = new boolean[100][100];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int u = scanner.nextInt();
        int v = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();
        u--;v--;s--;t--;
        int [][]a = new int[n][n];
        for(int i = 0 ; i < n; i++){
            for(int j = 0; j < n ; j++){
                a[i][j] = scanner.nextInt();
                if(a[i][j] == 0){
                    used[i][j] = true;
                }
            }
        }
        dfs(u,v,n);
        if(!used[s][t]){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
    public static void dfs(int i, int j, int n){
        used[i][j] = true;
        for(int k = 0;k < 8; k++){
              int i1 = i + dx[k];
              int j1 = i + dy[k];
              if(i1 < n && i1 >= 0 && j1 < n && j1 >= 0 && !used[i1][j1]){
                dfs(i1,j1,n);
              }
        }
    }
    
}
