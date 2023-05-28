package setmap;
import java.util.*;
//sử dụng map
public class bai3c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap <Integer, Integer> map = new HashMap<>();
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0 ; i < n;  i++){
            a[i] = scanner.nextInt();
        } 
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])== false){
                System.out.print(a[i]+ " ");
                map.put(a[i], 1);
            }
        }
    }
}
