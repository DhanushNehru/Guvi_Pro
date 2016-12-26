#include<stdio.h>
main()
{
    int i;
    char ch1[10],ch2[10];
    printf("Enter two string::");
    scanf("%s",ch1);
    scanf("%s",ch2);
    for(i=0;i<strlen(ch1);i++)
    {
        ch1[i]=ch1[i]+10;
        printf("%c",ch1[i]);
    }
    printf("\n");
    i=0;
    for(i=1;i<strlen(ch2)-1;++i)
    {
        ch2[i]=ch2[i]+10;
        if(ch2[i]+10>122)
        {
            ch2[i]=122-ch2[i];
            ch2[i]=97+10-ch2[i]-11;
        }//if(ch[i]>'z')
           // ch2[i]=z+
    }
    for(i=0;i<strlen(ch2);++i)
    {
        printf("%c",ch2[i]);
    }
}
