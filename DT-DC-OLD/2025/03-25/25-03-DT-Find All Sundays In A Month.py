'''
The program must accept two string values SI, S2 and an integer Y as the input. The string Sl represents
the weekday of the ISt Jan in the year Y. The string S2 represents a month in the year Y. The program must
print the dates of all the sundays in the month S2 of the given year Y as the output. Each date must be
printed in the format DD-MMM-YYYY.

Input:
Fri
May
2021

Output:
02-May-2021
09-May-2021
16-May-2021
23-May-2021
30-May-2021

Explanation:
Here Sl = Fri, S2 = May and Y = 2021.
The dates of all the sundays in May-2021 are given below
02-May-2021
09-May-2021
16-May-2021
23-May-2021
30-May-2021

'''
daysInWeek = ['Sun','Mon', 'Tue','Wed', 'Thu', 'Fri', 'Sat']
day = daysInWeek.index(input().strip())
m = input().strip()
month = ['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov', 'Dec'].index(m)
year = int(input().strip())
days = [31, 
    29 if(year % 400 == 0 or (year % 100 != 0  and year % 4 == 0)) else 28, 
    31, 30, 31, 30, 
    31, 31, 30, 31, 30, 31
]
prefixDays = []
prefixDaysCount = 0
for i in range(12):
    prefixDays.append(prefixDaysCount)
    prefixDaysCount += days[i]
targetMonthFirstDay =  ((day  + prefixDays[month]) % 7)

firstSunday = (7 - targetMonthFirstDay) % 7 + 1

#finding the first sunday
for d in range(firstSunday, days[month]+1, 7):
    print(f"{d:02}"+"-"+str(m)+"-"+str(year))