'''The program must accept two string values Sl and S2 as the input. The string S2 contains only
the characters C, A and D. The program must modify the string Sl based on the characters
present in the string S2.
I) Copy (C) - Copy all the characters in the string Sl.
2) Append (A) - Append the characters which are copied last time.
3) Delete (D) - Delete the last character in the string Sl if at least two characters are present.
Finally, the program must print the modified string Sl as the output.
NQtß The first two characters of S2 are always C and A.

Input
skill
CAACAADDA

Output:
skillskillskillskillskillskillskillskillskiskillskillskill
'''

string=input().strip()
copy=''
op=input().strip()
for operation in op:
    if(operation=='C'):
        copy=string
    elif(operation=='A'):
        string+=copy
    else:
        if(len(string)>=2):
            string=string[:len(string)-1]
print(string)