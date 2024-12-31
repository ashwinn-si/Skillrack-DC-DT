number=int(input())
fibo_series=[0,1]
while(True):
    if(fibo_series[-1]>=number):
        break
    fibo_series.append(fibo_series[-1]+fibo_series[-2])
len_fibo=len(fibo_series)
for i in range(len_fibo):
    for j in range(i+1,len_fibo):
        if(fibo_series[i]+fibo_series[j]==number):
            print(fibo_series[i],fibo_series[j])
            quit()
print("-1")
