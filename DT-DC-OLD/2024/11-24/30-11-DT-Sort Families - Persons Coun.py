'''
The program must accept the first name and the last name of N persons as the input. The
last name of each person represents the name of his/her family (i.e., if the last name of two or
more persons are the same, then those persons belong to the same family). The program must
sort the families in descending order based on the number Of persons. If two or more families
have the same number of persons, then the program must sort the families in ascending order
based on the family name. Finally, the program must print the total number of families F, the
name of each family and the number of persons in it as the output.
'''

hash_map = {}
n = int(input())
for i in range(n):
    first_name , last_name = input().strip().split()
    if(not hash_map.get(last_name)):
        hash_map[last_name] = 1
    else:
        hash_map[last_name]+=1
result = [[i,hash_map[i]] for  i in hash_map]
print(len(result))
for i in sorted(result,key = lambda x: (-x[1],x[0])):
    print(i[0],end=" ")
    print(i[1])