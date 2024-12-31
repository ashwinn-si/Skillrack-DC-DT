'''The program must accept an array of N integers and an integer K as the input. The program
must perform the following processes K times.
- The program must shift the even integers in the array by I position to the left (the odd
integers remain in the same positions).
- Then the program must print the integers in the modified array as the output.
Note: At least two even integers are always present in the given N integers.

Input:
63
42 15 66 72 27 32

Output:
66 15 72 32 27 42
72 15 32 42 27 66
32 15 42 66 27 72
'''

has={}
N,K=map(int,input().split())
numbers=list(map(int,input().split()))
even_numbers=[i for i in numbers if(i%2==0)]
for i in range(N):
    if(numbers[i]%2==1):
        has[i]=numbers[i]
for i in range(K):
    c=0
    even_numbers=even_numbers[1:]+[even_numbers[0]]
    for i in range(N):
        if(i in has):
            print(has[i],end=" ")
        else:
            print(even_numbers[c],end=" ")
            c+=1
    print()
