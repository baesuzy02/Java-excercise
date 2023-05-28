package mang1chieutrungbinh;

import java.util.*;

public class bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        int min = (int)2e9,cnt=0;
        for (int i = 1 ; i < n ; i++){
            if(a[i] - a[i-1] < min){
                min = a[i] - a[i-1];
                cnt = 1;
            }else if (a[i] - a[i-1] == min ){
                cnt++;
            }
        }
        System.out.println(min + " " + cnt);
    }
    
}
