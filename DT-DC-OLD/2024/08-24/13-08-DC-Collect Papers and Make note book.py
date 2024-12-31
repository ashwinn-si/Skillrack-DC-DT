#check_logic

'''There are two rows of boxes (N boxes in each row), where each box contains a certain number
of papers. A boy wants to make a notebook using the papers from these 2*N boxes based on
the following conditions.
- He always picks the first box in the first row.
- If both the boxes contain an odd number of papers or an even number of papers at the same
position in the two rows, then he can move down or up and collects the papers from the box.
Else he moves towards right side and collects the paper from the box.
The number of papers in each box is passed as the input to the program. The program must
print the number of papers in the boxes he picked to make the notebook as the output.

Example Input/Output 1:
5
4032 61 87 44
30 93 51 7428
Output:
40 30 93 51 61 874428'''

def even_odd_checker(a,b):
    if((a%2==0 and b %2==0) or(a%2==1 and b%2==1)):
        return True
    else:
        return False
N=int(input())
box_1=list(map(int,input().split()))
box_2=list(map(int,input().split()))
condition_satisfy_pos=[]
for i in range(N):
    if(even_odd_checker(box_1[i],box_2[i])):
        condition_satisfy_pos.append(i)
flag_changer_row=1 # 1-> box_1_row | 2 -> box_2_row

i=0
while(i<N):
    if(i in condition_satisfy_pos):
        if(flag_changer_row==1):
            print(box_1[i],box_2[i],end=" ")
        else:
            print(box_2[i],box_1[i],end=" ")
        flag_changer_row=1 if(flag_changer_row==0) else 0
    else:
        print(box_1[i] if(flag_changer_row==1) else box_2[i],end=" ")
    i+=1