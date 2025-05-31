'''
In a college, there are N events are planned in a day. The program must accept the start time and end time of each
event as the input. The program must print YES if a student is able to participate in all N events. Else the program must
print NO as the output.
Note: The start time and end time of the events are in 24-hour format HH:MM.
Boundary Condition(s):
1 N 100
Input Format:
The first line contains N.
The next N lines, each containing the start time and the end time of each event separated by a space.
Output Format:
The first line contains YES or NO.
Example Input/Output 1:
Input:
4
11:30 12:30
17:00 18:00
10:00 10:30
12:00 13:30
Output:
NO
Explanation:
Here the student cannot participate in all 4 events as there is an overlap between the two events.
11:30 12:30
12:00 13:30
So NO is printed as the output.
'''
#Your code below
def convert_mins(hr, mins):
    return hr*60 + (mins )
    
def split_time(time):
    hr, mins = time.split(":")
    return convert_mins(int(hr), int(mins))
    
approved_time = []
N = int(input())
for i in range(N):
    st_time, end_time = input().split()
    st_mins = split_time(st_time)
    end_mins = split_time(end_time)
    for j in approved_time:
        approved_st_time = j[0]
        approved_end_time = j[1]
        if((st_mins >= approved_st_time and st_mins < approved_end_time) or (end_mins > approved_st_time and end_mins <= approved_end_time)):
            print("NO")
            quit()
    approved_time.append([st_mins, end_mins])
print("YES")