package mang1chieutrungbinh;

import java.util.*;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[]a = new int[n];
        int[]b = new int[m];
        TreeSet<Integer> hop = new TreeSet<>();
        TreeSet<Integer> giao = new TreeSet<>();
        HashSet<Integer> setA = new HashSet<>();
        for (int i = 0 ; i < n ; i++){
            a[i] = scanner.nextInt();
            hop.add(a[i]);
            setA.add(a[i]);
        }
        for (int i = 0 ; i < m; i++){
              b[i] = scanner.nextInt();
              hop.add(b[i]);
              if(setA.contains(b[i])){
                giao.add(b[i]);
              }
        }
        for (int x : giao){
            System.out.print(x + " ");
        }
        System.out.println("");
        for (int x : hop){
            System.out.print(x + " ");
        }
    }
    
}
