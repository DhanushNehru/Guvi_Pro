#include<string.h>
#include<stdio.h>
main()
{
    char num[10];
    int i,j=0,temp=0,length=0;
    printf("Enter a number ::");
    scanf("%s",&num);
    for(i=0;i<strlen(num);i++)
    {
        for(j=i+1;j<strlen(num);j++)
        {
            if(num[i]>num[j])
            {
                temp=num[i];
                num[i]=num[j];
                num[j]=temp;
            }
        }
    }
    for(i=0;i<2;i++)
        printf("%c",num[i]);
}
