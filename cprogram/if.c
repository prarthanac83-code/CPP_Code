#include<stdio.h>
int main(){
    int num=0;
    printf("enter the number:");
    scanf("%d",&num);
    if(num%2==0){
        printf("number is even");
    }else{
        printf("number is odd");
    }
}