'''
In a garden, there are N flower plants in a row. There are three types of plants which are given below.
Type 1: It gives only a red flower every day.
Type 2: It gives only a green flower every 2 days.
Type 3: It gives only a blue flower every 3 days.
Initially, there are no flowers in the N plants. The program must accept N characters denoting the colors of
the N plants and N integers denoting the maximum number of flowers that the plants can give. The program
must print the total number of flowers in each color that the gardener can get in T days. The value of T is
also passed as the input.

Input:
4
R G R B
10 5 5 2
7

Output:
1232

Explanation:
Day 1: The gardener gets 2 red flowers.
Day 2: The gardener gets 2 red flowers and 1 green flower.
Day 3: The gardener gets 2 red flowers and 1 blue flower.
Day 4: The gardener gets 2 red flowers and 1 green flower.
Day 5: The gardener gets 2 red flowers.
Day 6: The gardener gets 1 red flower, 1 green flower and 1 blue flower.
Day 7: The gardener gets 1 red flower.
Total number of red flowers = 12.
Total number of green flowers = 3.
Total number of blue flowers = 2.
'''

y time complexity suddenly @Clg - Senior Jagadish
time complexity 0(N)
illa daa thambi naa mrng seekaram ah podanum nuh O(T x N) la potuten
aprom leisure time laa simple podalam nuh paathutu poten
adha differentiate panna dhan adha poten daa thambi !
ntng much !
atha brooo neega romba dedicated ha irrukinga
i say two solution of yours in one day, in one sum you are putting in short short form aparam you are expanding the var names ala
mass broo neee
#Your code below
N = int(input())
numbers = list(map(int, input().split()))
result=[]
for index in range(N):
    for i in range(numbers[index]):
        currList = [numbers[index] for j in range(numbers[index])]
        result.append(currList)
R = len(result)
C = max(numbers)
for col in range(C):
    for row in range(R):
        if(col + 1 > result[row][0]):
            print("*",end= " ")
        else:
            print(result[row][col], end = " ")
    print()
Complexity : O(N * number[index] * number[index])+O(R * C)

