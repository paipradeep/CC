#include<stdio.h>
#define TRUE 1
#define FALSE 0
void main(){
    char ip[100];
    scanf("%s",ip);
    int l = strlen(ip);
    int i=0,j=l-1,flag=TRUE;
    while(i<j)
    {
        if(ip[i]!=ip[j]){
            flag = FALSE;
            break;
        }
        else{
            i++;j--;
        }
    }
    if(flag)
        printf("YES");
    else
        printf("NO");
}

    
    
