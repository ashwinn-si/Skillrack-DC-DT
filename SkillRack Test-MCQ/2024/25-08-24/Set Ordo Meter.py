'''
An odometer has 5 slots, where each slot contains a wheel. Initially, the odometer shows the
number 00000. A person wants to set a number N in the odometer. He can rotate the wheels
only in clockwise direction from right to left in the odometer. The value of N is passed as the
input to the program. The program must print the combinations he gets when setting up the
number N in the odometer.

Input:
30151

Output:
00000
00001
00011
00021
00031
00041
00051
00151
10151
20151
30151
'''

N=input().strip()
if(len(N)<5):#to check if 5 character are always there
    N='0'*(5-len(N))+N
value=['0','0','0','0','0']
index=-1
while(''.join(i for i in value) !=N):
    if(value[index]==N[index]):
        index-=1
    else:
        print(''.join(i for i in value))
        value[index]=str(int(value[index])+1)
print(N)

'''
C SOLUTION
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main(){
    char number[1008];
    scanf("%s",number);
    if(5 > strlen(number)){
        char temp_zero[1008]="";
        char temp_zero_char='0';
        for(int i=1;i<=(5-strlen(number));i++){
            strncat(temp_zero,&temp_zero_char,1);
        }
        strcat(temp_zero,number);
        strcpy(number,temp_zero);
    }
    int a[1008];
    int ai=0;
    int zero_array[5]={0};
    for(int i=strlen(number)-1;i>=0;i--){
        a[ai++]=(number[i] - '0');
    }
    for(int i=0;i<5;i++){
        while(zero_array[i]<a[i]){
            for(int j=ai-1;j>=0;j--){
                printf("%d",zero_array[j]);
            }
            printf("\n");
            zero_array[i]++;
        }
    }
    printf("%s",number);
    return 0;
}
'''