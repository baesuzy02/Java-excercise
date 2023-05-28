package xaunangcao;

import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> a = new ArrayList<>();
        String s = scanner.nextLine();
        int cnt[] = new int[1000000];
        for(int i = 0 ; i < s.length(); i++){
            a.add(s.charAt(i));
            cnt[a.get(i)]++;
        }
        a.sort((o1, o2) -> o1 - o2);
        int res = 0;
        Character tmp = ' ';
        Character tmp2 = ' ';
        int rem = (int)1e9;
        for(int i = 0; i <a.size(); i++){
            if(cnt[a.get(i)] >= res){
                res = cnt[a.get(i)];
                tmp = a.get(i);
            }
            if(cnt[a.get(i)] <= rem){
                rem = cnt[a.get(i)];
                tmp2 = a.get(i);
            }
        }
        System.out.println(tmp + " " + res);
        System.out.println(tmp2 + " " + rem);
    }
    
}
