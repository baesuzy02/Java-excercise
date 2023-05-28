package mang1chieutrungbinh;

import java.util.*;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++){
            a.add(scanner.nextInt());
        }
        System.out.println(a.get(1) - a.get(0));
        System.out.println(a.get(n-1) - a.get(0));
        for (int i = 1 ; i < n-1; i++){
            System.out.println(Math.min(a.get(i) - a.get(i-1), a.get(i+1) - a.get(i)) + " ");
            System.out.println(Math.max(a.get(i) - a.get(0), a.get(n-1) - a.get(i)) + " ");
        }
        System.out.println(a.get(n-1) - a.get(n-2) + " ");
        System.out.println(a.get(n-1) - a.get(0));

    }
    
}
