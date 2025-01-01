'''The program must accept an integer N as the input. The program must form an integer X by
modifying the binary representation of N based on the following condition.
- If Os are repeated consecutively (possibly once) in the binary representation of N, then the
program must replace those Os with the number of times it is repeated consecutively.
Finally, the program must print the binary representation of X as the output.
Note: There are no more than 9 consecutive Os in the binary representation of N.

Input:
25
Output:
Explanation:
Here N = 25, the binary representation of 25 is 11001.
After replacing the consecutive Os in 11001 with the number of times it is repeated
consecutively, it becomes 11221.
'''

number_bin=bin(int(input()))[2:]
len_num=len(number_bin)
zero_position=[]
for i in range(len_num):
    if(number_bin[i]=='0'):
        zero_position.append(i)
result_num=''
pointer_1=0
curr_count=1
while(pointer_1<len_num):
    if(pointer_1 not in zero_position):
        result_num+='1'
    else:
        if(pointer_1+1 in zero_position):
            curr_count+=1
        else:
            for i in range(curr_count):
                result_num+=str(curr_count)
            curr_count=1
    pointer_1+=1
print(bin(int(result_num))[2:])