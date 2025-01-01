#!recursion sum

'''The program must accept a string S as the input. The program must reverse the first half of S
and then reverse the second half of S. Then the program must reverse the first half and the
second half in the first half of S. Then the program must reverse the first half and the second
half in the second half of S. Finally, the program must print the modified string as the output.
Note: If the length of the string is odd, keep the middle character in the same position and
reverse the two halves.

Input:
argument

Output:
guarntme
'''

def reverse(left_pointer , right_pointer , characters_list):
    
    while(left_pointer <= right_pointer):
        
        characters_list[left_pointer] , characters_list[right_pointer] = characters_list[right_pointer] , characters_list[left_pointer]
        
        left_pointer += 1
        
        right_pointer -= 1

def half_reverse(count , characters_list):
    
    if(count > 2):
        return characters_list
    
    N = len(characters_list)

    left_half = characters_list[ : (N // 2)]
    
    right_half = (characters_list[((N // 2) + 1) : ]) if(N & 1) else (characters_list[(N // 2) : ])
    
    reverse(0 , (len(left_half) - 1) , left_half)
    
    reverse(0 , (len(right_half) - 1) , right_half)
    
    left_half = half_reverse((count + 1) , left_half)
    
    right_half = half_reverse((count + 1) , right_half)
    
    right_half = ([characters_list[(N // 2)]] + right_half) if(N & 1) else (right_half)
    
    return (left_half + right_half)

print((''.join(half_reverse(1 , list(input().strip())))))