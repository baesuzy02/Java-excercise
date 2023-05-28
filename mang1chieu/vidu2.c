#include <stdio.h>
#include <math.h>
//C
int nt ( int n){
    if (n < 2){
        return 0;
    }
    for(int i = 2 ; i <= sqrt(n); i++){
        if (n%i == 0){
            return 0;
        }
    }
    return 1;
}
int main(){
    int n ;
    scanf("%d", &n);
    int a[n];
    for (int i = 0 ; i < n ; i++){
        scanf("%d", &a[i]);
    }
    int cnt = 0;
    int cnt2 = 0;
    for (int i = 0; i < n; i++){
        if (a[i] % 2 == 1){
             printf("%d ", a[i]);
             cnt++;
        }
    }
    printf ("%d\n", cnt);
    for (int i = 0 ; i < n ; i++){
        if (a[i] % 2 == 0) {
            printf("%d ", a[i]);
            cnt2++;
        }
    }
    printf("%d\n", cnt2);
    for (int i = 0 ; i< n; i++){
        if (nt(a[i])){
            printf("%d ", a[i]);
        }
    }

}