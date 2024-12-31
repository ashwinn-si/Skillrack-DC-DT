'''The program must accept a string S containing only alphabets as the input. The program must
form two string values SI and S2 of equal length L (where L is the length of S) based on the
following conditions.
- Initially, the string Sl contains all the alphabets in S and S2 contains only asterisks.
- For each alphabet in the string S, if the previous alphabet is a vowel, the program must
interchange the characters in Sl and S2 at the same position.
Finally, the program must print Sl and S2 in separate lines as the output.
Input
boom
Output:
bo**
**om
'''

def vowel_checker(w):
    if(w in 'aeiouAEIOU'):
        return True
    else:
        return False
string=input().strip()
len_string=len(string)
s1=[string[i] for i in range(len_string)]
s2=['*' for i in range(len_string)]
for i in range(1,len(string)):
    if(vowel_checker(s1[i-1]) or vowel_checker(s2[i-1])):
        s1[i],s2[i]=s2[i],s1[i]
print(''.join(i for i in s1))
print(''.join(i for i in s2))
#----------------------------------------------------------------
#3 test cases failed
def vowel_checker(w):
    if(w in 'aeiouAEIOU'):
        return True
    else:
        return False
string=input().strip()
len_string=len(string)
vowel_pos=[]
s1=''
s2=''
for i in range(len_string):
    if(i==0):
        if(vowel_checker(string[-1])):
            vowel_pos.append(0)
            continue
    if(vowel_checker(string[i-1])):
        vowel_pos.append(i)
for i in range(len_string):
    if(i in vowel_pos):
        s1+='*'
        s2+=string[i]
    else:
        s1+=string[i]
        s2+='*'
print(s1)
print(s2)