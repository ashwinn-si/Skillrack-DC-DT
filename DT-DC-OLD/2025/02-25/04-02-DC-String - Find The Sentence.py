#Your code below
def helper(sentence , count):
    resIndex = 0
    for currSentence in sentence:
        count -= len(currSentence)
        if(count <= 0):
            print(*currSentence,end="")
            print(".")
            quit()
    
sentence = [[i for i in sen.strip().split(" ")]for sen in input().strip().split(".")]
del sentence[len(sentence) - 1 ]
N = int(input())
if(N > 0):
    helper(sentence , N)
else:
    helper(sentence[::-1] , N*-1)