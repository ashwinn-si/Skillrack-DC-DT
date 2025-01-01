package UnSolved;
/*
Left/Right Shift Alphabets
The program must accept two string values $1 and S2 containing only lower case alphabets as the input. The program must print YES if it is possible to convert the string $1 to $2 based on the following condition.
-If the Xth alphabet CH in S1 is not equal to the Xth alphabet in S2, then the alphabet CH can be
replaced with the other alphabet which is obtained by shifting the alphabet CH X positions to the left or right circularly in the English alphabet set. If it is not possible to convert $1 to $2, then the program must print NO as the output.

Example Input/Output 1:

Input:
nckgo
mango

Output:
YES

Explanation:
Here S1 = nckgo and S2 = mango.
The 1st alphabet in S1 and S2 are not same. So n is replaced by shifting 1 position to the left. Now S1 becomes mckgo.
The 2nd alphabet in S1 and S2 are not same. So c is replaced by shifting 2 positions to the left. Now S1 becomes makgo.
The 3rd alphabet in S1 and S2 are not same. So k is replaced by shifting 3 positions to the right. Now $1 becomes mango.
The 4th and 5th alphabets in S1 and S2 are same. Now S1 and S2 are equal.
So YES is printed as the output.

Example Input/Output 2:

Input:
football
gqlxwust

Output:
YES

Example Input/Output 3:

Input:
spcnujdt
robotics
Output: NO
*/