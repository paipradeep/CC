#include<stdio.h>
#include<math.h>
void main(){
    int n,q;
    scanf("%d %d",&n,&q);
    int a[1000000];
    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);
    for(int i=0;i<q;i++){
        int tp;
        scanf("%d",&tp);
        if(tp == 0){
            int L,R;
            scanf("%d %d",&L,&R);
            /*int value=0;
            for(int i=R-1;i>=L-1;i--)
                value += a[i]*pow(2,i+1-R);
            printf("%d",value);*/
            if(a[R-1])
                printf("ODD\n");
            else
                printf("EVEN\n");
        }
        else if(tp==1){
            int x;
            scanf("%d",&x);
            a[x-1] ^= 1;
        }
    }
}
