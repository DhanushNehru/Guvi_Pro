#include<stdio.h>
main()
{
    char ch[100];
    int i,alpha[26]={0},flag=0;
    printf("Enter a string ::");
    gets(ch);
    for(i=0;ch[i]!='\0';i++)
    {
        if(ch[i]>='A' && ch[i]<='Z')
        {
            flag=flag+!alpha[ch[i]-'A'];
            alpha[ch[i]-'A']=1;

        }
        if(ch[i]>='a' && ch[i]<='z')
        {
            flag=flag+!alpha[ch[i]-'a'];
            alpha[ch[i]-'a']=1;
        }

    }
    if(flag==26)
        printf("The sentence is a panagram");
    else
        printf("The sentence is not a panagram");
}
