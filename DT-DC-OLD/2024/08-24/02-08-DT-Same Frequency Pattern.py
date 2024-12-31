def unique_word_checker(w,key):
    if(key==1):
        for i in s1_uniq:
            if(i[0] == w):
                return(False)
        else:
            return(True)
    else:
        for i in s2_uniq:
            if(i[0] ==w):
                return(False)
        else:
            return(True)
s1=input().strip()
s2=input().strip()
s1_uniq=[]
s2_uniq=[]
for letter in s1:
    if(unique_word_checker(letter,1)):
        s1_uniq.append([letter,s1.count(letter)])
for letter in s2:
    if(unique_word_checker(letter,2)):
        s2_uniq.append([letter,s2.count(letter)])
if(len(s1_uniq) !=len(s2_uniq)):
    print("no")
    quit()
s1_uniq=sorted(s1_uniq,key=lambda x:x[1])
s2_uniq=sorted(s2_uniq,key=lambda x:x[1])
for i in range(len(s1_uniq)):
    if(s1_uniq[i][1] != s2_uniq[i][1]):
        print("no")
        quit()
print("yes")
