package mang1chieutrungbinh;

import java.util.*;

public class bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tien = {1000,500,200,100,50,20,10,5,2,1};
        long n = scanner.nextLong(),cnt=0;
        int index = 0;
        while ( n!=0){
            cnt+=n/tien[index];
            n = n % tien[index];
            index++;
        }
        System.out.println(cnt);
    }
    
}
