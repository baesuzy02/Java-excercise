package mang2chieu;
import java.util.*;
public class bai17 {
    public static int n, m;
    public static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    public static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    public static int[][] a = new int[105][105];
    public static boolean[][] used = new boolean[105][105];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i][j] == 1 && !used[i][j]) {
                    loang(i, j);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    public static void loang(int i, int j) {
        used[i][j] = true;
        for (int k = 0; k < 8; k++) {
            int i1 = i + dx[k];
            int j1 = j + dy[k];
            if (i1 >= 1 && i1 <= n && j1 >= 1 && j1 <= m && a[i1][j1] == 1 && !used[i1][j1]) {
                loang(i1, j1);
            }
        }
    }
}
