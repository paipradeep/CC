//2D array Hourglass problem
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
#define INF 1000
int main(){
    int arr[6][6];
    for(int arr_i = 0; arr_i < 6; arr_i++){
       for(int arr_j = 0; arr_j < 6; arr_j++){
          
          scanf("%d",&arr[arr_i][arr_j]);
       }
    }
    int maxcount = -INF ,count = 0;
    for(int i=0;i<=3;i++)
        for(int j=0;j<=3;j++){
            count = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
            if(count>maxcount)
                maxcount = count;
        }
    printf("%d",maxcount);
    
    return 0;
}
