#Your code below
N = int(input())
req = list(map(int,input().split()))
books = [i for i in range(1,int(input())+1)]
for i in req:
    print(books.index(i)+1,end=" ")
    del books[books.index(i)]
    books.insert(0,i)