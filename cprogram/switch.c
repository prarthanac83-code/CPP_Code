#include<stdio.h>
int main(){
    int num=0;
    printf("Enter the number:");
    scanf("%d",&num);
    switch(num){
    case 1:
    printf("number is is equal to 1");
    break;
    case 2:
    printf("number is is equal to 2");
    break;
    case 3:
    printf("number is is equal to 3");
    break;
    default:
    printf("number is not equal to 1 or 2 or 3");
}
}