//Bubble Sort
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
    int *a = malloc(sizeof(int) * n);
    for(int a_i = 0; a_i < n; a_i++){
       scanf("%d",&a[a_i]);
    }
    int swapcount = 0,flag=0;
    for(int i=0;i<n;i++){
        flag=0;
        for(int j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                int t = a[j];
                a[j] = a[j+1];
                a[j+1] = t;
                swapcount++;
                flag = 1;
            }
        }
        if(!flag)
            break;
    }
    printf("Array is sorted in %d swaps.\n",swapcount);
    printf("First Element: %d\n",a[0]);
    printf("Last Element: %d\n",a[n-1]);
    return 0;
}
