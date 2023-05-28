package hashset;

import java.util.HashSet;
import java.util.Scanner;
//  in ra các giá trị khác nhau trong mảng bằng set.
public class lythuyet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int x : a) {
            set.add(x);
        }
        System.out.println(set.size());
        for ( int x : set) {
            System.out.print(x+ " ");
        }
    }
    
}
