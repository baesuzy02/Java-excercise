package setmap;
import java.util.*;
// sử dụng set
public class bai3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet <Integer> set = new HashSet<>();
        int n = scanner.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (set.contains(a[i])== false){
                System.out.print(a[i] + " ");
                set.add(a[i]);
            }
        }
    }
    
}
