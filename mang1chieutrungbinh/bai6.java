package mang1chieutrungbinh;

import java.util.*;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }
        int cnt = 0;
        for (int i = 0 ; i < n; i++){
            for (int j = i+1 ; j < n ; j++){
                if (gcd(a.get(i),a.get(j)) == 1){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
    public static int gcd (int a, int b){
        while ( b != 0){
            int t = a % b;
            a = b;
            b = t;
        }
        return a;

    }
}
