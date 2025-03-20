'''
In a garden, there are N trees in a row. Each tree has a certain number of flowers. An empty bucket is
placed under each tree to collect the falling flowers. If the wind blows on the right side, a flower from each
tree will fall into the bucket on its left side. Similarly, if the wind blows on the left side, a flower from each tree
will fall into the bucket on its right side. The program must accept N integers representing the number of
flowers in the N trees and a string S as the input. The string S contains only L's and R's, where L indicates
that the wind blows on the left side and R indicates that the wind blows on the right side. The program must
print the number of flowers collected in each bucket in the end as the output.
Note: If a flower falls on the left side of the first tree or a flower falls on the right side of the last tree, it
means that the flower is falling outside of the garden and hence it is not collected in any of the buckets.

Input:
4
10 3 6 5
LRRL
Output:

2 4 3 2

Explanation:
The given string S = LRRL.
Initially, all 4 buckets are empty.
0 0 0 0
ISt character L: After the wind blows on the left side, the number of flowers in the buckets become
0 1 1 1
2nd character R: After the wind blows on the right side, the number of flowers in the buckets become
1 2 2 1
3rd character R: After the wind blows on the right side, the number of flowers in the buckets become
2 3 3 1
4th character L: After the wind blows on the left side, the number of flowers in the buckets become
2 4 3 2
'''

#Your code below
N = int(input())
no_flowers = list(map(int, input().strip().split()))
string = input().strip()
result = [0] * N
offset = {'R' : -1, 'L' : 1}
for i in string:
    for index in range(0, N):
        if(no_flowers[index] > 0):
            new_index = index + offset[i]
            if(0 <= new_index < N):
                result[new_index] += 1
            no_flowers[index] -= 1
print(*result)