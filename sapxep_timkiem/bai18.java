package sapxep_timkiem;

import java.util.*;
public class bai18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []a = new int[n];
        int min = (int)1e9,max = 0;

        HashSet<Integer> se = new HashSet<>();
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
            min = Math.min(min, a[i]);
            max = Math.max(max,a[i]);
            se.add(a[i]);
        }
        System.out.println(max - min + 1 - se.size());

    }
    
}
