'''The program must accept three string values Sl, S2 and S3 as the input. The program must
remove the common characters in SI and S3. Then the program must remove the common
characters in S2 and S3. Finally, the program must print the remaining characters in SI and S2
in the order of their occurrence as the output.
Note; At least one character is always present in Sl or S2 after removing the common
characters with S3.

Input:
cloud
lab
clab

Output:
oudl
'''

s1=[i for i in input().strip()]
s2=[i for i in input().strip()]
s3=[i for i in input().strip()]
remove_s1=[]
remove_s2=[]
for i in range(len(s1)):
    if(s1[i] in s3):
        remove_s1.append(i)
        s3.remove(s1[i])
for i in range(len(s2)):
    if(s2[i] in s3):
        remove_s2.append(i)
        s3.remove(s2[i])
for i in range(len(s1)): 
    if(i not in remove_s1):
        print(s1[i],end="")
for i in range(len(s2)):
    if(i not in remove_s2):
        print(s2[i],end="")