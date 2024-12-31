'''The program must accept three integers N, P and Q as the input. The program must print the
number of times Q occurs at least once in the sum when P is added to N for P times as the
output.

Input:
15
5
5

Output:
2

Explanation:
Here N = 15, P = 5 and Q = 5.
Initially, the sum is 15 and the count is O.
In the ISt iteration, 5 is not present in the sum 20 (15+5 = 20). So the count remains O.
In the 2nd iteration, 5 is present in the sum 25 (20+5 = 25). So the count becomes 1.
In the 3rd iteration, 5 is not present in the sum 30 (25+5 = 30). So the count remains 1.
In the 4th iteration, 5 is present in the sum 35 (30+5 = 35). So the count becomes 2.
In the 5th iteration, 5 is not present in the sum 40 (35+5 = 40). So the count remains 2.
'''

def checker(n,q):
    len_n=len(str(n))
    len_q=len(str(q))
    for i in range(0,len_n-len_q+1):
        n=str(n)
        if(n[i:i+len_q]==str(q)):
            return True
    return False
N=int(input())
P=int(input())
Q=int(input())
counter=0
for i in range(P):
    N+=P
    if(checker(N,Q)):
        counter+=1
print(counter)