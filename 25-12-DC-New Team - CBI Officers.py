def getter(team):
  curr_input = input().split()
  curr_input[1] = int(curr_input[1])
  if(team == 1):
    team_1_members.append(curr_input)
  else:
    team_2_members.append(curr_input)


N = int(input())
team_1_members = []
team_2_members = []
for i in range(N):
  getter(1)
  
M = int(input())
for i in range(M):
  getter(2)

required_count = int(input())
res_team = []
team_1_members = sorted(team_1_members , key = lambda x : (-x[1] , x[0]))
team_2_members = sorted(team_2_members , key = lambda x : (-x[1] , x[0]))

res_team = [team_1_members[0] , team_1_members[1] , team_2_members[0] , team_2_members[1]]
remaining_members = sorted(team_1_members[2:] + team_2_members[2:] ,key = lambda x : (-x[1] , x[0]))
for i in range(required_count-4):
    res_team.append(remaining_members[i])

for i in sorted(res_team , key = lambda x : (-x[1] , x[0])):
  print(i[0])