'''The program must accept a string S representing the registration number of a vehicle and an
integer K as the input. The registration number of a vehicle is generated based on the
following conditions.
- The format of the vehicle registration number is either #-#### or ##-####.
- The first part (# or ##) of the vehicle registration number represents the following alphabet
series.
A, B, C, D, E, X, Y, Z, AA, AB, AC, AD, m. AX, AY,AZ, BA BB, BC, BD, ZX, ZY and ZZ.
- The second part (####) of the vehicle registration number represents the following integer
series.
0001, 0002, 0003, 0004, 0005, 9996, 9997, 9998 and 9999.
- The vehicle registration number is generated by combining the above two series.
A-OOOI, A-0002, A-0003, A-9998, A-9999, AA-OOOI, AA-0002, AA-0003, ZZ-9997,
ZZ-9998 and ZZ-9999.
The program must print the Kth registration number from the given registration number as the
output.
Note: The K registration number from the given registration number is always valid.
'''

input_string=input().split("-")
register_alpha=input_string[0]
register_number=int(input_string[1])
no_register_skip=int(input())
if(register_number+no_register_skip>9999):
    register_number=register_number+no_register_skip-9999
    if(len(register_alpha)==1):
        if(register_alpha=='Z'):
            register_alpha='AA'
        else:
            register_alpha=chr(ord(register_alpha)+1)
    else:
        register_alpha_let=[i for i in register_alpha]
        if(register_alpha_let[1]=='Z'):
            register_alpha_let[1]='A'
            register_alpha_let[0]=chr(ord(register_alpha_let[0])+1)
        else:
            register_alpha_let[1]=chr(ord(register_alpha_let[1])+1)
        register_alpha=''.join(i for i in register_alpha_let)
    print(register_alpha+'-'+f"{register_number:04}")
else:
    print(register_alpha+'-'+f"{register_number+no_register_skip:04}")