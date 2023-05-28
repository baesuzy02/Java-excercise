package sapxep_timkiem;

import java.util.*;

public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a.add(scanner.nextInt());
        }
        Collections.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer t , Integer t1){
                return t1 - t;
            }
            
        });
        long res = 0;
        for(int i = 0; i < n; i++){
            int tmp = a.get(i) - i;
            if(tmp >= 0){
                res += tmp;
            }
        }
        System.out.println(res);
    } 
}
