'''The program must accept the size S of a file in MB and the data rate R in KB/sec as the input.
The program must print the total cost C (in paise) to download the file based on the following
price chart.
1 to 500 seconds - 1 paisa/second.
501 to 1000 seconds - 2 paise/second.
> 1000 seconds - 3 paise/second.
The above price chart depends on how many seconds it takes to download the required file.
Note: 1 MB = 1024 KB

Input:
50
Output:
29220
'''

import math
total_size=int(input())*1024
mb_rate=int(input())
total_time_req=math.ceil(total_size/mb_rate)
total_cost=0
if(total_time_req<=500):
    total_cost=total_time_req
elif(total_time_req<=1000):
    total_cost+=500
    total_cost+=((total_time_req-500)*2)
else:
    total_cost+=1500
    total_cost+=((total_time_req-1000)*3)
print(total_cost)
