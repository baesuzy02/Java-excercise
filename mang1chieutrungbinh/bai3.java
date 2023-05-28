package mang1chieutrungbinh;

import java.util.*;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            a.add(scanner.nextInt());
        }
        int max = 0;
        for (int i = 0 ; i < n ; i++){
            if (a.get(i) > max){
                max = a.get(i);
                System.out.print(a.get(i) + " ");
            }
        }
    }
    
}
