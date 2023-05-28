package setmap;
import java.util.*;
// sử dụng set
public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        for (int i = 0 ; i < n ; i++){
            arr[i] = scanner.nextInt();
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set.size()); 
    }
}

    

