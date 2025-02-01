#Your code below
def helper(flag , team):
    if(flag == 0):
        return 1
    if(flag == team):
        return 2
    return 0
    
N = int(input())
hashmap = {}

for _ in range(N):
    currMatchTeams = input().strip().split("-")
    team1Score = currMatchTeams[0].strip().split(" ")
    team2Score = currMatchTeams[1].strip().split(" ")
    flag = 1 # 1-> team 1 time | 2 -> team 2 wins | 0 -> draw
    if(int(team1Score[1]) < int(team2Score[0])):
        flag = 2
    elif(int(team1Score[1]) == int(team2Score[0])):
        flag = 0
    if(team1Score[0] not in hashmap):
        points = helper(flag , 1)
        hashmap[team1Score[0]] = [team1Score[0] , points , int(team1Score[1])]
    else:
        prevScore = hashmap[team1Score[0]]
        points = helper(flag , 1)
        hashmap[team1Score[0]] = [team1Score[0] , points+prevScore[1], int(team1Score[1])+prevScore[2]]
    if(team2Score[1] not in hashmap):
        points = helper(flag, 2)
        hashmap[team2Score[1]] = [team2Score[1] , points , int(team2Score[0])]
    else:
        prevScore = hashmap[team2Score[1]]
        points = helper(flag , 2)
        hashmap[team2Score[1]] = [team2Score[1] , points+prevScore[1],int(team2Score[0]) + prevScore[2]]
for i  in sorted([hashmap[i] for i in hashmap],key = lambda x : (-x[1],-x[2],x[0])):
    print(*i)