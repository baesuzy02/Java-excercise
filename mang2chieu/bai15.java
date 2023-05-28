package mang2chieu;
import java.util.*;
public class bai15{
    public static void fb(long fibo[]){
        fibo[0] = 0;
        fibo[1] = 1;
        for(int i=2;i<=82;i++){
            fibo[i] = fibo[i-1]+fibo[i-2];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fibo[] = new long[83];
        fb(fibo);
        long a[][] = new long[n][n];
        int i1 = 0, i2 = n-1 , j1=0, j2 = n-1;
        int cnt = 0;
        while(i1<=i2 && j1<=j2){
            for(int i = j1;i <= j2;i++){
                a[i1][i] = fibo[cnt];
                cnt++;
            }
            i1++;
            for(int i = i1; i<=i2;i++){
                a[i][j2] = fibo[cnt];
                cnt++;
            }
            j2--;
            for(int i = j2;i >= j1;i--){
                a[i2][i] = fibo[cnt];
                cnt++;
            }
            i2--;
            for(int i = i2;i>=i1;i--){
                a[i][j1] = fibo[cnt];
                cnt++;
            }
            j1++;
        }
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println("");
        }
    }
}