/*Count max number of consecutive 1's in binary representation
of a number*/
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n; 
    scanf("%d",&n);
    int bin[100];
    int i=0;
    while(n!=0){
        bin[i++] = n%2;
        n /= 2;
    }
    int maxcount = 0,count=0;
    for(int j=0;j<i;j++){
        if(bin[j]){
            count++;
            if(count>maxcount)
                maxcount=count;
        }
        else
            count=0;
    }
    
    printf("%d",maxcount);
    return 0;
}

