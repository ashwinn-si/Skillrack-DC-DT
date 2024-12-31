N1 , N2 = map(int,input().split())
print(int(bin(N1)[2:]+bin(N2)[2:],2) if(int(bin(N1)[2:]+bin(N2)[2:]) > int(bin(N2)[2:]+bin(N1)[2:])) else int(bin(N2)[2:]+bin(N1)[2:],2))