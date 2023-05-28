package sapxep_timkiem;

import java.util.*;

public class bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        int [] a = new int[n];
        int [] b = new int[m];
        for(int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        }
        for(int i = 0 ; i < m ;i++){
            b[i] = scanner.nextInt();
        }
        int i = 0 , j = 0;
        while(i < n && j < m){
            if(a[i] <= b[j]){
                System.out.print("b" + (int)(i + 1) + " ");
                i++;
            }else {
                System.out.print("c" +(int)(j + 1) + " ");
                j++;
            }
        }
        while (i < n){
            System.out.print("b" + (int)(i + 1) + " ");
            i++;
        }while(j < m){
            System.out.print("c" + (int)(j + 1) + " ");
            j++;
        }
    }
}
