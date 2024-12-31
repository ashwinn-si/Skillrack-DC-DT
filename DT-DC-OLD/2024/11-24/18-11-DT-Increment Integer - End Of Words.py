'''
The program must accept a String S containing multiple words as the input. The program must rnodfy the
string based on the following conditions.
- If the word in the string S ends with an integer, the program must increment the integer by X. Else 1
must be added to the end of the Xth word.
* If the integer has leading zeroes. they must be considered when incrementing the value.
Finalty, the program must print the modified string S as the output-
Note; Each word in S always contains at least one alphabet.

Input:
tea0034 coffee77 boost98 Glucose salt00001

Output:
tea0035 coffee79 boost101 Glucosel salt00006

Explanation:
There are S words in the given string.
The ISt word with the integer 0034, SO the word becomes tea0035 after by 1.
The 2nd word ends with the integer 77, so the word becomes coffee79 after incrementing by 2.
The 3rd word ends with the integer 98, so the word becomes boost101 after incrementing by 3.
There iS no integer at the end Of the 4th word. so the word becomes Glucosel atter adding 1 at the end.
The 5t1 word ends with the integer 00001, so the word becornes salt00006 after incrementing by 5.
Hence the output
tea0035 coffee79 Glucosel salt00006
'''

def integerEndIndexFinder(string):
    currIndex = -1
    while(True):
        if(not string[currIndex].isdigit()):
            return len(string)+currIndex+1
        currIndex-=1
string = input().strip().split()
currIndex=1
for currString in string:
    numberStartIndex=integerEndIndexFinder(currString)
    if(numberStartIndex == len(currString)):
        print(currString+'1',end=" ")
    else:
        number = int(currString[numberStartIndex:])+currIndex
        padding = len(currString)-len(currString[:numberStartIndex])
        neededpadding= max(0,padding - len(str(number)))
        print(currString[:numberStartIndex]+'0'*neededpadding+str(number),end=" ")
    currIndex+=1