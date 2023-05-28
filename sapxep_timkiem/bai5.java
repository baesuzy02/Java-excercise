package sapxep_timkiem;

import java.util.*;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        Integer [] a = new Integer[n];
        for(int i = 0 ; i < n; i++){
            a[i] = scanner.nextInt();
        } 
        Arrays.sort(a , new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b){
                return Math.abs(a) - Math.abs(b);
            }
            
        });
        for(int i = 0 ; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
