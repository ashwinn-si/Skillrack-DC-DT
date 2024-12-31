'''The program must accept a string S as the input. The program must find the number of vowels
V in the given string S. The program must print the string in V lines based on the following
conditions.
- In the first line, the ISt vowel and the Vth in the string S are enclosed within hyphens.
- In the second line, the 2nd vowel and the (V-l)th in the string S are enclosed within hyphens.
- In the third line, the 3rd vowel and the (V-2)th in the string S are enclosed within hyphens.
- Similarly, the remaining lines are printed as the output.
Note:
    - If V is odd, the middle line contains the string S where the middle vowel is enclosed within
    hyphens.
    - At least one vowel is always present in the string S.

Input:

NOTEBOOKPAPER

Output:

N-O-TEBOOKPAP-E-R
NOT-E-BOOKP-A-PER
NOTEB-O--O-KPAPER
NOTEB-O--O-KPAPER
N-O-TEBOOKPAP-E-R
'''


def vowel_checker(w):
    if(w in 'aeiouAEIOU'):
        return True
    else:
        return False

def printing_function(rows,index,key):
    for i in range(rows):
        for j in range(len_string):
            if(vowel_pos[index]==j or vowel_pos[count_vowel-1-index]==j):
                print('-'+string[j]+'-',end="")
            else:
                print(string[j],end="")
        print()
        if(key==1):
            index+=1
        else:
            index-=1
string=input().strip()
vowel_pos=[]
len_string=len(string)
count_vowel=0
for i in range(len_string):
    if(vowel_checker(string[i])):
        vowel_pos.append(i)
        count_vowel+=1
if(count_vowel%2==0):
    no_rows_each=count_vowel//2
    printing_function(no_rows_each,0,1)
    printing_function(no_rows_each,(count_vowel//2)-1,0)
else:
    no_rows_each=count_vowel//2
    printing_function(no_rows_each+1,0,1)
    printing_function(no_rows_each,count_vowel//2,0)