/*Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine = 0)
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, .fine = 15 * (days)
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .fine = 500*(months)
If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000*/
#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    int d1,d2,m1,m2,y1,y2;
    scanf("%d %d %d",&d1,&m1,&y1);
    scanf("%d %d %d",&d2,&m2,&y2);
    int d = (d1 - d2);
    int m = (m1 - m2);
    int y = (y1 - y2);
    int penalty = 0;
    if(y1<y2 || y1==y2 && m1<m2 || y1==y2 && m1==m2 && d1<d2)
        penalty = 0;
    else if(!y){
        if(!m)
            penalty = 15 * d;
        else
            penalty = 500 * m;
    }
    else{
        penalty = 10000;
    }
    printf("%d",penalty);
    return 0;
}
