#include <stdio.h>
#include<string.h>
#include<ctype.h>
int main()
{
	 char c[100],i;
	 scanf("%s",c);
	 int l=strlen(c);
	 for(i=0;i<l;i++)
	    {if(islower(c[i]))
	        putchar(toupper(c[i]));
	     else
	       putchar(tolower(c[i]));
	    }
	    //printf("%s",c);
}
	 
