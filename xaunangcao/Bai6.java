package xaunangcao;

import java.util.*;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Character> set = new TreeSet<>();
        TreeMap<Character, Integer> map = new TreeMap<>();
        TreeMap<Character, Integer> map2 = new TreeMap<>();
    
        String s = sc.nextLine();
        String t = sc.nextLine();
        for(int i=0; i<s.length(); i++) {
            set.add(s.charAt(i));
            map.put(s.charAt(i), 1);
        }
        for(int i=0; i<t.length(); i++) {
            set.add(t.charAt(i));
            if(map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), 2);
            }
            if(map.containsKey(t.charAt(i)) == false) {
                map2.put(t.charAt(i), 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet) {
            if(entry.getValue() == 1) {
                System.out.print(entry.getKey());
            }
        }
        System.out.println();
        Set<Map.Entry<Character, Integer>> entrySet2 = map2.entrySet();
        for(Map.Entry<Character, Integer> entry2 : entrySet2) {
            System.out.print(entry2.getKey());
        }
        
    }
    
}
