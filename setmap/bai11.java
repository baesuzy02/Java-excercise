package setmap;
import java.util.*;

public class bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m =scanner.nextInt();
        HashSet <Integer> set1 = new HashSet<>();
        HashSet <Integer> set2 = new HashSet<>();
        for (int i = 0 ; i < n;i++){
            int x = scanner.nextInt();
            set1.add(x);
        }
        for (int i = 0 ; i < m ; i++){
            int x = scanner.nextInt();
            set2.add(x);        
        }
        for (int x : set1){
            if (!set2.contains(x)){
                System.out.print(x + " ");
            }
        }
    }
}
