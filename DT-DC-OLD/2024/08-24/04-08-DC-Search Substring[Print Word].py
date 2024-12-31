string_words=input().strip().split()
no=int(input())
for i in range(no):
	curr_letter=input().strip()
	flag=1
	for word in string_words:
		if(curr_letter in word):
			print(word,end=" ")
			flag=0
	if(flag==1):
		print("-1",end=" ")
	print()
