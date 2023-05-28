package xaunangcao;

import java.util.*;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt[] = new int[256];
        String s = scanner.nextLine();
        TreeMap<Character, Integer> map = new TreeMap<>();
        for(int i = 0; i < s.length(); i++){
            cnt[s.charAt(i)]++;
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i),1);
            }
        }
        Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
        for(Map.Entry<Character, Integer> entry : entrySet){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        for(int i = 0 ; i < s.length(); i++){
            if(cnt[s.charAt(i)] != 0){
                System.out.println(s.charAt(i) + " " + cnt[s.charAt(i)]);
                cnt[s.charAt(i)] = 0;
            }
        }
    }
    

    
}
