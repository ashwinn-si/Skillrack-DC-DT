'''Jagadish Code'''

import math

def get_length(N):
    
    return (1) if(N == 0) else ((int(math.log10(abs(N))) + 1))

N = int(input())

elements_list = list(map(int , input().split()))

print(sum(((lambda number_length : ((number_length * (10 ** number_length)) + number)) (get_length(number))) for number in elements_list))