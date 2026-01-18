#include<stdio.h>
int main(){
     int a,b,c;
    printf("enter the three numbers:\n");
    scanf("%d%d%d",&a,&b,&c);
    if(a>b&&a>c){
        printf("%d,is the largest number! \n",a);
    }if(b>a&&b>c){
        printf("%d,is the largest number! \n",b);
    }if(c>a&&c>b){
        printf("%d,is the largest number! \n",c);
    }if(a==b&&a==c){
        printf("All are equal! \n");
    }if(a%2==0){
        printf("number is even \n");
    }else{
        printf("number is odd  \n");
    }if(b%2==0){
        printf("number is even \n");
    }else{
        printf("number is odd \n");
    }if(c%2==0){
        printf("number is even \n");
    }else{
        printf("number is odd \n");
    }
}