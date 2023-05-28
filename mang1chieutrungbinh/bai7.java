package mang1chieutrungbinh;

import java.util.*;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0 ; i < n; i++){
            a.add(scanner.nextInt());
        }
        Collections.sort(a,new Comparator<Integer>(){
            @Override
            public int compare(Integer t, Integer t1){
                if (t % 2 == 1 && t1 % 2 == 0 ) return -1;
                if (t % 2 == 0 && t1 % 2 == 1) return 1;
                if (t % 2 == 0 && t1 % 2 == 0) return t - t1;
                return t1 -t;
            }
            
        });
        for (int x : a){
            System.out.print(x + " ");
        }
    }
    
}
