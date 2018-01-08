/*Given a string,S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).*/
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    char arr[10000];
    int t,len;
    scanf("%d",&t);
    while(t){
        t--;
        scanf("%s",arr);
        len = strlen(arr);
        for(int i=0;i<len;i+=2){
            printf("%c",arr[i]);
        }
        printf(" ");
        for(int i=1;i<len;i+=2){
            printf("%c",arr[i]);
        }
        printf("\n");
    }
    return 0;
}
