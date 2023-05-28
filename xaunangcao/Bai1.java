package xaunangcao;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int cnt1 = 0, cnt2 = 0, cnt3 = 0;

        for(int i = 0 ; i < s.length() ; i++){
              if(Character.isAlphabetic(s.charAt(i))){
                cnt1++;
              } else if (Character.isDigit(s.charAt(i))){
                cnt2++;
              } else {
                cnt3++;
              }
        }
        System.out.println(cnt1 + " " + cnt2 + " " + cnt3);

    }
}
