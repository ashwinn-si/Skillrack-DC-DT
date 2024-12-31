'''The program must accept a string S as the input. The program must print the minimum
number Of characters M to be added in the string S so that a palindrome is formed using the
characters in the string S as the output
The string S is case sensitive.

Input:
RoaR

Output:
1
Explanation:
Here S = RoaR
If the character a or o is added to the string, the palindrome can be formed as given below.
or
so the count 1 is printed as the output.
'''
#we should check the count 

string=input().strip()
uniq_char=list(set(i for i in string))
len_uniq=len(uniq_char)
one_occurr_flag=False
res_count=0
for i in range(len_uniq):
    if(string.count(uniq_char[i])%2==1 and not one_occurr_flag):
        one_occurr_flag=True
    elif(string.count(uniq_char[i])%2!=0):
        res_count+=1
print(res_count)