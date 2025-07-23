'''The program must accept a string S containing alphabets and spaces and reverse the last K
vowels in the string S.

Input:
good morning
3

Output:
goid mornong
'''
def vowel_checker(ch):
    if(ch in 'aeiouAEIOU'):
        return True
    else:
        return False
string=input().strip()
len_string=len(string)
no=int(input())
vowel_position=[i for i in range(len_string) if(vowel_checker(string[i]))]
vowel_change_st=len(vowel_position)-no
curr_reverse_index=-1
curr_vowel_count=0
for i in range(len_string):
    if(vowel_checker(string[i])):
        curr_vowel_count+=1
        if(curr_vowel_count>vowel_change_st):
            print(string[vowel_position[curr_reverse_index]],end="")
            curr_reverse_index-=1
            continue
    print(string[i],end="")
