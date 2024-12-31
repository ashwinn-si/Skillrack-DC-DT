#Your code below
S1 = list(input().strip())
S2 = list(input().strip())
for i in range(len(S1)):
    for j in range(i+1,len(S1)):
        sample = S1[::]
        sample[i],sample[j] = sample[j],sample[i]
        if(sample == S2):
            print("YES")
            quit()
print("NO")