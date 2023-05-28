package xaunangcao;

import java.util.*;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Character> set = new TreeSet<>();
        TreeMap<Character, Integer> map = new TreeMap<>();
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        for(int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
            map.put(s.charAt(i), 1);
        }
        for(int i = 0; i < t.length(); i++){
            set.add(t.charAt(i));
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),2);
            }
        }
        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet){
            if(entry.getValue() == 2){
                System.out.print(entry.getKey());
            }
        }
        System.out.println();
        for(Character x : set){
            System.out.print(x);
        }
    }
             
}
