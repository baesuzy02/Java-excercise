package vidu;

import java.util.*;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        for(int i = 0; i< n; i++){
            a[i] = scanner.nextInt();
        }
        int max = a[0], min = a[0], sum = 0;
        int sum1 = 0,sum2 = 0;
        for(int i = 0 ; i < n; i++){
            sum+=a[i];
        }
        System.out.println(sum);
        for(int i = 0 ; i < n ;i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        System.out.println(max);
        for(int i = 0 ; i < n ;i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println(min);
        for(int i = 0 ; i < n; i++){
            if(a[i] % 2 == 0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        for(int i = 0 ; i < n; i++){
            if(a[i] % 2 == 1){
                System.out.print(a[i] + " ");
            }
        }
        for(int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                sum2+=a[i];
            }
        }
        System.out.print(sum2 + " ");
        for(int i = 0 ; i < n; i++){
            if(a[i] % 2 == 1){
                sum1+=a[i];
            }
        }
        System.out.print(sum1 + " ");
        for(int i = 0 ; i < n ; i++){
            if(nt(a[i])){
                System.out.print(a[i]+ " ");
            }
        }
    }
    public static boolean nt (int n){
        if(n < 2){
            return false;
        } 
        for(int i = 2 ; i <= Math.sqrt(n); i++){
           if(n % i == 0){
            return false;
           }
        }
        return true;
    }
}
