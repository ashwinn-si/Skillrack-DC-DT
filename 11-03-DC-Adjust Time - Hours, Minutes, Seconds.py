'''
The program must accept a time T in 24-hr format (HH:MM:SS) and three integers X, Y, Z as the input. The
integer X represents the number of hours to be added to the time T. The integer Y represents the number of
minutes to be added to the time T. The integer Z represents the number of seconds to be added to the time
T. After each adjustment of the time (add X hours, add Y minutes and add Z seconds), the program must
print the revised time as the output.

Input:
10:05:45
4 65 100

Output:
14:05:45
15:10:45
15:12:25

Explanation:
Here T = 10:05:45, X = 4, Y = 65 and Z = 100.
After adding 4 hours, the time becomes 14:05:45.
After adding 65 minutes, the time becomes 15:10:45.
After adding 100 seconds, the time becomes 15:12:25.
'''
#Your code below
def print_result():
    print("{:02}:{:02}:{:02}".format(hr, mins, secs))
hr, mins, secs = map(int,input().strip().split(":"))
add_hr, add_mins, add_secs = map(int, input().strip().split(" "))

hr = (hr + add_hr) % 24;
print_result()

mins  += add_mins
if(mins >= 60):
    hrs_to_added = mins // 60
    hr = (hr + hrs_to_added) % 24
    mins = mins % 60
print_result()

secs += add_secs
if(secs >= 60):
    mins_to_added = secs // 60
    mins += mins_to_added
    if(mins >= 60):
        hrs_to_be_added = mins // 60
        hr = (hr + hrs_to_be_added) % 24
        mins = mins % 60
    secs = secs % 60
print_result()