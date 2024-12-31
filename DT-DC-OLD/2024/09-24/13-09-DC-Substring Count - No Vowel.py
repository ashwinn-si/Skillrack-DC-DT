'''The program must accept a string S containing only alphabets as the input. The program must
print the number of substrings not having the vowels and having the length greater than I in
the string S as the output.'''

def vowel_checker(string):
    for i in string:
        if( i in 'aeiouAEIOU'):
            return False
    return True
string=input().strip()
count=0
for i in range(len(string)):
    for j in range(i+1,len(string)):
        if(vowel_checker(string[i:j+1])):
            count+=1
print(count)