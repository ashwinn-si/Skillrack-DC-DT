'''A boy found N bags in a row, where each bag has a certain number of boxes. Each box may or
may not have gold coins. The program must accept N integers as the input.
- N represents the total number of bags.
- Each integer among the N integers represents a bag.
- The number of digits in each integer represents the number of boxes in the respective bag.
- Each digit of an integer represents the number of gold coins present in the respective box.
The boy has to collect the gold coins from the N bags based on the following conditions.
- He cannot select more than one box from a bag.
- He always selects a box with the least number of gold coins (possibly O) from the first bag
and then he starts moving towards the right side to collect the gold coins.
- Then he can select a box if the number of gold coins in that box is greater than or equal to
the number of gold coins in the previously selected box. If two or more such boxes are present
in the bag, then he must select the box with the least number of gold coins among those
boxes. If there is no such box in the bag, then he can skip the bag.
Finally, the program must print the total number of gold coins that the boy can collect

Input:
6
12045 67 81 7835

Output:
26

Explanation:
The total number of bags in the row is 6.
The number of boxes in the 6 bags are 3, 2.2.2, 2 and 2.
He always selects a box with the least number of gold coins from the first bag.
So he can select O from the ISt bag 120.
Then he can select 4 from the 2nd bag 45 (4 > O).
Then he can select 6 from the 3rd bag 67 (6 > 4).
Then he can select 8 from the 4Hl bag 81 (8 > 6).
Then he can select 8 from the bag 78 (8 > = 8).
He cannot select any box from the 6th bag 35. So he skipped the last bag.
The total number of gold coins in the selected boxes is 26 (0+4+6+8+8).
So 26 is printed as the output.
'''

N=int(input())
gold_bages=input().strip().split()
res_gold=0
curr_gold=-1
for curr_bag in gold_bages:
    avalaible_gold=[]
    for gold in curr_bag:
        if(int(gold)>=curr_gold):
            avalaible_gold.append(int(gold))
    if(len(avalaible_gold)>0):
        curr_gold=min(avalaible_gold)
        res_gold+=curr_gold
print(res_gold)
