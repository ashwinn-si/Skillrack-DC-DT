'''
The program must accept a string S as the input The program must two ccntjrunus alphabets if
they are same but different case. Similarly. the program must remove the alphabets until there are no two
Such Continuous alphabets in S, IT the characters are the String S, the program
-1 as the output.

Input:
SkillLRack

Output:
SkillRack

Explanation:
The given string iS SkilliLRack.
The continuous alphabets and L are same but different in case, SO they are removed from the string
SkilllLRack.
Now, no more such continuous alphabets present in string. Sn SkillREk iA printed as the output.
'''

#Your code below
def helper(a , b):
    if(a.islower() and b.isupper()):
        return True
    elif(a.isupper() and b.islower()):
        return True
    return False
string = list(input().strip())
while(True):
    flag = False
    for i in range(len(string)-1):
        if(helper(string[i] , string[i+1]) and string[i].lower() == string[i+1].lower()):
            del string[i] # if we delete 10 then the next index will become 10 
            del string[i]
            flag = True
            break
    if(not flag):
        if(len(string) == 0):
            print("-1")
            quit()
        print(''.join(i for i in string))
        quit()