def helper(cards):
  half1 = cards[:N//2]
  half2 = cards[N//2:]
  res = []
  for i in range(N//2):
    res.append(half1[i])
    res.append(half2[i])
  return res

N , S = map(int,input().split())
cards = [i for i in range(1, N+1)]
for i in range(S):
  cards = helper(cards)
print(*cards)