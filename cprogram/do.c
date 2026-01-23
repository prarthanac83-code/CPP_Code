#include<stdio.h>
#include<string.h>
int main(){
    char password[]="Hello";
    char input[20];
do{
    printf("Enter the password!");
    scanf("%s",input);
}while(strcmp(input,password)!=0);
    printf("access granted!");
}    

