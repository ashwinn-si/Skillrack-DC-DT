'''
The program must accept two integers N and X as
the input. The program must print the character
in the Nth term of the Fibonacci parentheses
series. The Fibonacci parentheses series given
below.
T1 = ()
T2 = ()
T3 = (T2+T1) = (()())
T4 = (T3+T2) = ((())())
T5 = (T4+T3) = (((()())())(()()))
'''

def depth_first_search(N):
    
    return (("()") if(N <= 1) else ("(" + depth_first_search((N - 1)) + depth_first_search((N - 2)) + ")"))

(lambda N , X : print(depth_first_search((N - 1))[(X - 1)])) (*map(int , input().split()))