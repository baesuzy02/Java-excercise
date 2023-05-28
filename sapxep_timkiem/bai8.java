package sapxep_timkiem;

import java.util.*;

public class bai8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Long,Long>map = new HashMap<>();
        long maxn = (long)-1000000000;
        long cntmax = 0;
        while(n-->0){
            long tmp = sc.nextLong();
            if(map.containsKey(tmp)){
                Long tanSuat = map.get(tmp);
                map.put(tmp,tanSuat+1);
            }
            else 
                map.put(tmp, (long)1);
        }
        Set<Map.Entry<Long,Long>>entrySet = map.entrySet();
        for(Map.Entry<Long,Long>entry:entrySet){
            if(cntmax<entry.getValue()){
                maxn = entry.getKey();
                cntmax = entry.getValue();
            }
            else if(cntmax == entry.getValue()){
                if(maxn>entry.getKey()){
                    maxn = entry.getKey();
                }
            }
        }
        System.out.println(maxn+" "+cntmax);
    }
}
