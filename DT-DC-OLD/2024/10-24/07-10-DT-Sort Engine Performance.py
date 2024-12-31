'''The program must accept the speed and the efficiency of N engines as the input. The program
must sort the engines based on the performance in descending order. The performance of an
engine is equal to the product of its speed and efficiency. If two or more engines have the
same performance, then sort those engines based on the speed in descending order. Finally,
the program must print the speed and efficiency of the N engines after sorting.

Input:
5
1 7 2 9 3
7 5 5 8 1

Output:
9 7 2 1 3
8 5 5 7 1

Explanation:
The performance of the ISt engine is 7 (1 * 7).
The performance of the 2nd engine is 35 (7 * 5).
The performance of the 3rd engine is IO (2 * 5).
The performance of the 4th engine is 72 (9 * 8).
The performance of the 5th engine is 3 (3 * 1).
So the engines are sorted in descending order based on the performance.
Hence the output is
9 7 2 1 3
8 5 5 7 1
'''
N=int(input())
engines_details=[] #speed,efficiency,performance
for i in list(map(int,input().split())):
    engines_details.append(i)
index=0
for i in list(map(int,input().split())):
    curr=[engines_details[index],]
    curr.append(i)
    curr.append(curr[0]*curr[1])
    engines_details[index]=curr
    index+=1
engines_details=sorted(engines_details,key=lambda x:(-x[2],-x[0]))
for i in engines_details:
    print(i[0],end=" ")
print()
for i in engines_details:
    print(i[1],end=" ")