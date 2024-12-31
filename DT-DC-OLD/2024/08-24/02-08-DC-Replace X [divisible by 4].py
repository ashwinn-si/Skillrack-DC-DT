n=int(input())
numbers=int(n[:len(n)-1])
for i in range(0,10):
	curr_number=numbers*10+i
	if(curr_number%4==0):
		print(curr_number,end=" ")
