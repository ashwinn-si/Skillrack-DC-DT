#Your code below
D = int(input())
dargon = list(map(int,input().split()))
M = int(input())
for i in list(map(int,input().split())):
    currStageRes = []
    printFlag = True
    for j in dargon:
        currStageRes.append(j-i)
        if(j-i < 0):
            printFlag = False
            break
    if(not printFlag):
        print("Game Over")
        quit()
    dargon = currStageRes[::]
    print(*currStageRes)
print("Game Over")