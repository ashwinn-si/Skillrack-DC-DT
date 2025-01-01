'''The program must accept an integer N as the input. The program must print the Nth term in
the following series as the output.
3, 5, 6, 9, 10, 12, 17, 18, 20, 24, 33,.. and so on.
All the integers in the above series have exactly two Is in their binary representations.
Boundary Condition(s):
1 1000
Input Format:
The first line contains N.
Output Format:
The first line contains the N
Example Input/Output I:
Input:
7
Output:
17
Explanation:
term in the above mentioned series.
The 7th term in the series 3, 6, 9, 10, 12, 17, 18, 20, 24 33,
So 17 is printed as the output.
... is 17.'''

#note[covert the given series in binary and see you can see a pattern]

def find_nth_two_bit_number(N):
    two_bit_numbers = []  # This list will hold numbers with exactly two bits set

    # Generate numbers with exactly two bits set
    for i in range(64):
        for j in range(i + 1, 64):
            # Generate a number with the i-th and j-th bits set
            num = (1 << i) | (1 << j) #line of confusion
            two_bit_numbers.append(num)

    # Sort the list of two-bit numbers
    sorted_two_bit_numbers = sorted(two_bit_numbers)

    # Return the N-th element from the sorted list (N-1 because of zero-based indexing)
    nth_number = sorted_two_bit_numbers[N - 1]

    # Print the result
    print(nth_number)

# Example usage:
N = int(input())
find_nth_two_bit_number(N)
