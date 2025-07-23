'''The program must accept an integer B representing the balance in a bank account and N
integers representing N transactions in the bank account as the input. A positive integer
indicates that the amount is added to the account(credit). A negative integer indicates that the
amount is withdrawn from the account(debit). For each transaction, the program must validate
the transaction and print the output based on the following conditions.
- If the amount to be credited is less than or equal to 10000 and a multiple of 100, then it
must be added to the balance and print the string value "Credit: Successful". Else the program
must print the string value "Credit: Failed".
- If the amount to be debited is less than or equal to the account balance and a multiple of
100, then it must be deducted from the balance and print the string value "Debit: Successful".
Else the program must print the string value "Debit: Failed".
Finally, the program must print the account balance after the given N transactions as the
output.
'''
total_bank_balance=int(input())
N=int(input())
for i in range(N):
    amount=int(input())
    if(amount>0):
        if(amount<=10000 and amount%100==0):
            total_bank_balance+=amount
            print("Credit:Successful")
        else:
            print("Credit:Failed")
    else:
        if(abs(amount)<=abs(total_bank_balance) and amount%100==0):
            total_bank_balance+=amount
            print("Debit:Successful")
        else:
            print("Debit:Failed")
print(total_bank_balance)