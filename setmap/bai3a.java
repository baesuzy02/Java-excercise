package setmap;
import java.util.*;
// sử dụng set
public class bai3a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        Set<Integer> set = new LinkedHashSet<>(); 

        for (int i = 0; i < n; i++) {
            set.add(A[i]);
        }

        for (int x : set) {
            System.out.print(x + " ");
        }
    }  
}

