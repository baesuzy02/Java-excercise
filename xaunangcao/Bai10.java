package xaunangcao;

import java.util.*;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        LinkedHashSet<String> lk = new LinkedHashSet<>();
        TreeSet<String> ts = new TreeSet<>();
        String []a = s.split("\\s+");
        
        for(String x : a){
            ts.add(x);
            lk.add(x);
        }

        for(String x : ts){
            System.out.print(x + " ");
        }
        System.out.println();
        for(String x : lk){
            System.out.print(x + " ");
        }
    }
    
}
