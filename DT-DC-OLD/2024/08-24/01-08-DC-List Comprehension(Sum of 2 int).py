numbers=list(map(int,input().split()))
numbers=sorted(numbers)
print(*numbers)
while(True):
    dummy_list=[]
    for i in range(0,len(numbers),2):
        if(i+1==len(numbers)):
            dummy_list.append(numbers[i])
        else:
            dummy_list.append(numbers[i]+numbers[i+1])
    print(*dummy_list)
    if(len(dummy_list)==1):
        break
    numbers=dummy_list
