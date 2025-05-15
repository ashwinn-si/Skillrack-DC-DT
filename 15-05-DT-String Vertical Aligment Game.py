'''
Two boys A and B play a string alignment game. The boy A gives two string values Sl and S2 to the boy B. The boy B
writes the given two string values vertically from top to bottom. Then the boy B must move the characters from the
second string to the first string horizontally only if there are spaces in the first string. And then the boy B must mark the
empty spaces with asterisks. The string values Sl and S2 are passed as the input to the program. The program must
print the string values the boy B wrote as the output.

Input:
I want to become a doctor
apple orange mango

Output:
Ia
p*
wp
al
ne
t*
o*
tr
oa
n*
bg
ee
c*
om
ma
en
g*
ao
**
d*
o*
c*
t*
o*
r*
'''

def helper(ch1, ch2):
    if(ch1 == ' ' and ch2 == ' '):
        print("**")
    elif(ch1 == ' '):
        print(ch2 + "*")
    elif(ch2 == ' '):
        print(ch1 + "*")
    else:
        print(ch1+ch2)

string1 = input().strip()
string2 = input().strip()
index = 0
len1 = len(string1)
len2 = len(string2)
while(index < len1 or index < len2):
    if(index < len1 and index < len2):
        helper(string1[index], string2[index])
    elif(index < len1):
        helper(string1[index], ' ')
    else:
        helper(string2[index], ' ')
    index += 1