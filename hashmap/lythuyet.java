package hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class lythuyet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <Integer,Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            if (map.containsKey(a[i])){
                int cnt = map.get(a[i]);
                cnt++;
              map.put(a[i], cnt);
            }else {
                map.put(a[i],1);
            }
            }
            Arrays.sort(a);
            for ( int i = 0 ; i < n ; i++) {
                if ( map.containsKey(a[i])) {
                    System.out.println(a[i] + "   " + map.get(a[i]));
                    map.remove(a[i]);
                }
            }
            
        }

    }
    

