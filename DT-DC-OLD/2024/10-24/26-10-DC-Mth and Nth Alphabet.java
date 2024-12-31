/*The program must accept three integers M. N and K as the input_ The must form a
string S of length K using the 26 lower case alphabets (a to z) based on the following
conditions.
- The alphabet of S must be the Mth alphabet in lower case alphabets, Then the
must remove the Mth alphabet from the lower case alphabets.
The 2nd alphabet of S must be the Nth alphabet in the remaining lower case alphabets Then
the program must remove the Nth alphabet frorn the case alphabets,
- The 3rd alphabet Of S must be the Mth alphabet in the lower case alphabets. Then
the program must remove the Mth alphabet from the lower case alphabets.
- The 4th Of S must be the Nth alphabet in the rernaining lower case alphabets. Then
the program must remove the Nth alphabet from the lower case alphabets.
- Similarty. the remaining alphabets of S must be formed using the remaining lower case
alphabets.
Finally. the program must print the string S as the output.
The English alphabet set must be considered in a for the Mth and Nth
alphabet.

Input:
5 8 10
Output:
eifkgmhojq

Explanation:
The 26 lower case alphabets are abcdefghijklmnopqrstuvwxyz
M = 5, N = 8 and K = 10.
Here we need to form a string of length 10.
ISt alphabet of S = 5th lower case alphabet e.
Now the remaining lower case alphabets are abcdfghijklmnopqrstuvwxyz
2nd alphabet of S 8th lower case alphabet i.
Now the remaining lower case alphabets are abcdfghjklmnopqrstuvwxyz
3rd alphabet of S = 50' lower case alphabet f.
Now the remaining lower case alphabets are abcdghjklmnopqrstuvwxyz
4th alphabet of S = 8th lower case alphabet
Now the remaining lower case alphabets are abcdghjlmnopqrstuvwxyz.
Similarly, the remaining 6 alphabets of S are formed using the remaining lower case alphabets.
The string S is eifkgmhojq, which is printed as the output.

Input:
30 27 5

Output:
dbhfl

*/