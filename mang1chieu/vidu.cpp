#include <iostream>
#include <math.h>
//c++
using namespace std;
int nt (int n){
    if ( n < 2){
        return 0;
    }
    for (int i = 2 ; i <= sqrt(n); i++){
              if (n%i == 0){
                return 0;
              }
    }
    return 1;
}
int main(){
    int n;
    cin >> n;
    int a[n];
    for (int i = 0 ; i < n ; i++){
        cin >> a[i];
    }
    int cnt = 0;
    int cnt2 = 0;
    int cnt3 = 0;
    for (int i = 0 ; i < n; i++){
        if (a[i] % 2 == 1){
            cout << a[i] << " ";
            cnt++;
        }
    }
    cout << cnt << "\n";
    for (int i = 0 ; i < n ;i++){
        if (a[i] % 2 == 0){
            cout << a[i] << " ";
            cnt2++;
        }
    }
    cout << cnt2 << "\n";
    for (int i = 0 ; i < n ; i++){
        if (nt(a[i])){
            cout << a[i] << " ";
            cnt3++;
        }
    }
    cout << cnt3 << " ";
}