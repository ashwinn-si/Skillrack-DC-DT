'''
The program must accept a string S containing only case alphabets as the input. The program must
print the output based on the following conditions.
- The program must print the unique alphabets in the string S in alphabetical order.
- After printing the unique alphabets, the program must remove them from the string S. Then the program
must repeat the processes until all the characters in S are removed.
All alphabets must be printed on the same line without space.

Input:
skillrack
Output
aciklrskl

Explanation:
The unique alphabets in the string skillrack are s k i I r a c. So these alphabets are printed in alphabetical
order,
aciklrs
After rer-noving those alphabets from the string skillrack, the string becomes kl.
The unique alphabets in the string kl are k So these alphabets are pnnted in alphabetical order,
After removing those alphabets from the string k', the stnng becomes empty (no characters in S).
Hence the output is
aciklrskl

'''

#Your code below
hashmap = {}
for i in sorted(input().strip()):
    if(i not in hashmap):
        hashmap[i] = 1
    else:
        hashmap[i] += 1
curr_count = 1
while(True):
    flag = False
    curr_string=[]
    for i in hashmap:
        if(hashmap[i] > 0):
            curr_string.append(i)
            flag = True
            hashmap[i]-=1
    curr_count += 1
    curr_string = sorted(curr_string)
    print(''.join(i for i in curr_string),end="")
    if(not flag):
        quit()