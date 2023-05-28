package xaunangcao;

import java.util.*;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set = new HashSet<>();
        String s = sc.nextLine();
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        if(set.size() == 26){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
