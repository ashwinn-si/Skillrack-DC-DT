'''
 The program must accept two string values Sl and S2
 representing the names of two persons as the input.
 The program must calculate the name matching score
 based on the following conditions.
 - If a character occurs in the same position in both
 names, then the score increments by 2.
 - If a character occurs in both names but in different
 positions, then the score increments by 1 .
 - Once a character in a position is used for the
 calculation, it cannot be considered again. However, if
 the same character occurs in another position, then it
 can be used.
 Finally, the program must print the name matching
 score for the given two persons as the output.
 
 Input:
 bhuvana
 lavanya
 
 Output:
 5
 
 Explanation:
 There is only one character that occurs in the same
 position in both names and it is highlighted below.
 bhuvana
 lavanya
 The characters v, a and n occur in both names but in
 different positions.
 So the total score is 2+ 1 +1 +1 = 5.
'''
def helper(largest_string):
  hashmap = {}
  for ch in largest_string:
    if ch in hashmap:
      hashmap[ch] += 1
    else:
      hashmap[ch] = 1
  return hashmap
string1 = input().strip()
string2 = input().strip()
smallest_string = string1 if(len(string1) < len(string2)) else string2
largest_string = string1 if(len(string1) > len(string2)) else string2
largest_string_hashmap = helper(largest_string)
N = len(smallest_string)
result = 0
for i in range(N):
  ch = smallest_string[i]
  if(ch in largest_string and largest_string_hashmap[ch] > 0):
    result += 1
    largest_string_hashmap[ch] = largest_string_hashmap[ch] - 1;
  if(ch == largest_string[i]):
    result += 1
print(result)