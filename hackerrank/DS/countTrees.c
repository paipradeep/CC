//To find total number of possible binary trees given n nodes
//Solution : Generate catalan number through dynamic programming
#include<stdio.h>
#include<stdlib.h>
void main(){
    int n,i,j;
    printf("\nEnter total number of nodes");
    scanf("%d",&n);
    int *arr = (int *)malloc((n+1)*sizeof(int));
    arr[0] = 1;
    arr[1] = 1;
    for(j=2;j<=n;j++)
        for(i=0;i<j;i++)
            arr[j] += arr[i]*arr[j-i-1];
    printf("%d",arr[n]);
}
