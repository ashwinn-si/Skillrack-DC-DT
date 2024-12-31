'''
In a class, there are N students. The class teacher wants to select students for the national level
sports competition. The selection criteria for the national level sports competition is given
below.
- The academic grade points must be greater than or equal to 3 and the sport grade points
must be greater than or equal to 8.
The name, academic grade points and sport grade points Of each student are passed as the
input to the program. The program must print the names of the eligible students for the
national level sport competition as the output. The names of the students must be printed in
descending order based on the sport grade points. If two or more students have the same
sport grade points, then the names of those students must be printed in descending order
based on the academic grade points If two or more students have the same sport grade
points and academic grade points, then the names of those students must be printed in
ascending order. If there is no eligible student in the class, then the program must print -1 as
the output.

Input
6
Shaan 7 7
Abdul 5 8
John 1 9
Patricia 3 8
Kaavya 5 8
Eric 69

Output
Abdul
Kaavya
Patricia
'''

N = int(input())
result = []
for i in range(N):
    name , aca , sport = input().split()
    if(int(aca) >= 3 and int(sport) >= 8):
        result.append([name,int(aca),int(sport)])
if(len(result) == 0):
    print("-1")
    quit()
for i in sorted(result , key = lambda x : (-x[2],-x[1],x[0])):
    print(i[0])