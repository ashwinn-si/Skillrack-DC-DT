/*The program must accept a string S and then for each repeating character, it must print the
distance from the previous occurrence. If there are no repeating character, then the program
must print -I as the output.

Input:
engine

Output:
n:3
e:5

Explanation:
The second n occurs 3 positions after the first n.
The second e occurs 5 positions after the first e.
*/
/*Test case : we should checker for lowercase uppercase and digits */

#include<stdio.h>
#include<stdlib.h>

int main()
{
    char string[1000];
    scanf("%s",string);
    int freq_digi[10]={0};
    int pos_digi[10]={0};
    int u_freq[27]={0};
    int l_freq[27]={0};
    int u_pos[27]={0};
    int l_pos[27]={0};
    int flag=0;
    for(int i=0;i<strlen(string);i++){
        char ch=string[i];
        if(isdigit(ch)){
            if(freq_digi[ch-'0']==0){
                pos_digi[ch-'0']=i;
                freq_digi[ch-'0']++;
            }else{
                flag=1;
                printf("%c:%d\n",string[i],i-pos_digi[ch-'0']);
                pos_digi[ch-'0']=i;
            }
        }else{
        if(islower(ch)){
            if(l_freq[ch-'a']==0){
                l_pos[ch-'a']=i;
                l_freq[ch-'a']++;
            }else{
                flag=1;
                printf("%c:%d\n",string[i],i-l_pos[ch-'a']);
                l_pos[ch-'a']=i;
            }
        }else{
            if(u_freq[ch-'A']==0){
                u_pos[ch-'A']=i;
                u_freq[ch-'A']++;
            }else{
                flag=1;
                printf("%c:%d\n",string[i],i-u_pos[ch-'A']);
                u_pos[ch-'A']=i;
            }
            
        }
        }
    }
    if(flag==0){
        printf("-1");
    }
}