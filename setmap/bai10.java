package setmap;
import java.util.*;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <Integer,Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int [] a = new int[n];
        int [] b = new int[m];
        for (int i = 0 ; i < n ; i++){
            a[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < m ;i++){
            b[i] = scanner.nextInt();
       }
       for (int i = 0 ; i < n ; i++){
        map.put(a[i], 1);
       }
       for (int i = 0 ; i < m ;i++){
        if (map.containsKey(b[i])){
            map.put(b[i], 2);
        }
       }
       for (int i = 0 ; i < n ; i++){
        if (map.containsKey(a[i])&& map.get(a[i]) == 2){
            System.out.print(a[i] + " " );
            map.remove(a[i]);
        }
       }
    }
    
}
