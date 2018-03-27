//O(nlogn) solution
#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>
int cmp(const void *p,const void *q){
    return *(const int *)q - *(const int *)p;
}
int getMinimumCost(int n, int k, int* c){
    qsort(c,n,sizeof(c[0]),cmp);
    int cost = 0;
    for(int i=0;i<n;i++){
        cost += (i/k + 1)*c[i];
    }
    return cost;
}

int main() {
    int n; 
    int k; 
    scanf("%d %d", &n, &k);
    int *c = malloc(sizeof(int) * n);
    for(int c_i = 0; c_i < n; c_i++){
       scanf("%d",&c[c_i]);
    }
    int minimumCost = getMinimumCost(n, k, c);
    printf("%d\n", minimumCost);
    return 0;
}
