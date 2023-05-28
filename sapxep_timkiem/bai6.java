package sapxep_timkiem;

import java.util.*;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer [] a = new Integer[n];
        for(int i = 0 ; i < n;i++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b){
                if(sum(a) == sum(b)){
                    return a - b;
                }else {
                        return sum(a) - sum(b);
                }
            }
            
        });
        for(int x : a){
            System.out.print(x + " ");
        }

    }
    public static int sum(int a){
        int res = 0;
        while (a != 0){
            res += a % 10;
            a /= 10;
        }
        return res;
    }
    
}
