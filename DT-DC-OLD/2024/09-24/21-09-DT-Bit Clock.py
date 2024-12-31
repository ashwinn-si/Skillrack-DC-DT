'''The program must accept an integer N as the input. The program must print all possible values
of time in 24-hour format (HH:MM) where the sum of number of Is in the binary
representations of HH and MM is equal to N in chronological order.

Input:
1

Output:
00:01
00:02
00:04
00:08
00:16
00:32
01:00
02:00
04:00
08:00
16:00
'''

N=int(input())
for hrs in range(24):
    for mins in range(60):
        if(bin(mins).count('1')+bin(hrs).count('1')==N):
            print("{:02d}:{:02d}".format(hrs,mins))