// Primality algorithm [ O(sqrt(n))]
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {
    int T,n;
    scanf("%d",&T);
    int flag = 1;
    while(T--){
        scanf("%d",&n);
        if(n == 1)
            flag = 0;
        else{
            flag = 1;
            for(int i=2;i<=sqrt(n);i++){
                if(n%i == 0){
                    flag = 0;
                    break;
                }
            }
        }
        if(flag) 
            printf("Prime\n");
        else   
            printf("Not prime\n");
        
    }
    return 0;
}
