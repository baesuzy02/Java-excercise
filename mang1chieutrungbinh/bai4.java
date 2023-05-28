package mang1chieutrungbinh;

import java.util.*;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0 ; i < n ; i++){
            a.add(scanner.nextInt());
        }
        if (check(a)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }
    public static boolean check (ArrayList<Integer>a){
        int d25 = 0,d50 = 0, d100 = 0;
        for (int i = 0; i < a.size(); i++){
            if (a.get(i) == 25){
                d25++;
            } else if (a.get(i) == 50){
                   if(d25 > 0){
                    d25--;
                    d50++;
                   } else {
                    return false;
                   }
            } else {
                if (d25 >= 1 && d50 >= 1){
                    d25--;
                    d50--;
                    d100++;
                }else if (d25 >= 3){
                    d25 -= 3;
                    d100++;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
    
}
