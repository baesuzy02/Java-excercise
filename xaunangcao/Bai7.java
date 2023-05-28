package xaunangcao;

import java.util.*;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if(check(s)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
    public static boolean check(String s){
        String t = s;
        StringBuilder str = new StringBuilder(s);
        return t.equals(str.reverse().toString());
    }
    
}
