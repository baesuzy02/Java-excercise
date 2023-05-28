package ham;

import java.util.*;

public class bai19{
    static int a[] = new int[1000005];
    public static void sangNt(){
        for(int i=0;i<=1000000;i++){
            a[i]=0;
        }
        for(int i=2;i<=Math.sqrt(1000000);i++){
            if(a[i]==0){
                for(int j=i*i;j<=1000000;j+=i){
                    a[j]=1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int q;
        Scanner sc = new Scanner(System.in);
        q = sc.nextInt();
        sangNt();
        for(int i=0;i<q;i++){
            int tmp;
            tmp = sc.nextInt();
            if(a[tmp]==0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
