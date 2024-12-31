'''
The program must accept a date D in the format DD.MM-YYYY as the input The program
must print the dates from the first day of month MM to the next date of D in the same
format as the output

Input:
06-02-2019

Output:
01-02-2019
02-02-2019
03-02-2019
04-02-2019
05-02-2019
06-02-2019
07-02-2019
'''

#Your code below
dates = list(map(int,input().strip().split("-")))#[date,month,year]
# conditions : 
# -> feb 28 , 29 days [leap year]
# -> 30 or 31 days
leap_year_flag = not True 
if((dates[2] % 4 == 0 and dates[2] % 100 != 0) or dates[2] % 400 == 0):
    leap_year_flag = True
#True -> 31 days | False -> 30 days
curr_month_end_date = 30
if(dates[1] == 2):
    if(leap_year_flag):
        curr_month_end_date = 29
    else:
        curr_month_end_date = 28
else:
    if(dates[1] <= 7):
        if(dates[1] % 2 == 0):
            curr_month_end_date = 30
        else:
            curr_month_end_date = 31
    else:
        if(dates[1] % 2 == 0):
            curr_month_end_date = 31
        else:
            curr_month_end_date = 30
for i in range ( 1 , dates[0]+2 , 1 ):
    if(i > curr_month_end_date and dates[1] == 12):
        print("{:02}-{:02}-{:04}".format(1,1,dates[2]+1))
        quit()
    if(i > curr_month_end_date):
        print("{:02}-{:02}-{:04}".format(1,dates[1]+1,dates[2]))
        quit()
    print("{:02}-{:02}-{:04}".format(i,dates[1],dates[2]))