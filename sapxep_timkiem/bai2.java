package sapxep_timkiem;

import java.util.*;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int X = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                if(Math.abs(x - X) != Math.abs(y - X)){
                    return Math.abs(x - X) - Math.abs(y - X);
                }
                else{
                    return x - y;
                }
            }
        });

        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer x, Integer y) {
                if(x % 2 == 0 && y % 2 == 0){
                    return x - y;
                }
                if(x % 2 == 1 && y % 2 == 1){
                    return y - x;
                }
                if(x % 2 == 0 && y % 2 == 1){
                    return -1;
                }
                return 1;
            }
        });

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}

