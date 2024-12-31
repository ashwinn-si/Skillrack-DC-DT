def vowel_checker(s):
    if(s in 'aeiouAEIOU'):
        return(True)
    else:
        return False
string=input().strip()
conso_index=[]
conso_count=0
str_len=len(string)
result=[]
for i in range(str_len):
    if(not vowel_checker(string[i])):
        conso_index.append(i)
        conso_count+=1
    result.append(string[i])
st_index,end_index=0,conso_count-1
rows=conso_count//2 if(conso_count%2==0) else (conso_count+1)//2
for _ in range((conso_count+1)//2):
    if(st_index != end_index):
        result[conso_index[st_index]]="["+result[conso_index[st_index]]+"]"
        result[conso_index[end_index]]="["+result[conso_index[end_index]]+"]"
    else:
        result[conso_index[st_index]]="["+result[conso_index[st_index]]+"]"
    print(''.join(i for i in result))
    st_index+=1
    end_index-=1
