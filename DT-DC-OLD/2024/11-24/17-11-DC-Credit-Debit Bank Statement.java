/*
The program must accept the initial balance in a bank account and N transactions details where the amount and the balance after each transaction is passed as the input. The program must print the bank Credit/Debit statements as shown in the Example Input/Output section.

Input:
5000 5
1000 4000
500 4500
400 4900
900 4000
2000 2000

Output:
Opening Balance:5000 
Debit:1000 Balance:4000
Credit:500 Balance:4500
Credit:400 Balance:4900
Debit:900 Balance:4000
Debit:2000 Balance:2000

*/
import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		int N = sc.nextInt();
		sc.nextLine();
		System.out.printf("Opening Balance:%d\n",amount);
		for(int i = 0 ; i < N ; i++){
		    int a = sc.nextInt();
		    int remainAmount = sc.nextInt();
		    sc.nextLine();
		    if(remainAmount > amount){
		        System.out.printf("Credit:%d Balance:%d\n",a,remainAmount);
		    }else{
		        System.out.printf("Debit:%d Balance:%d\n",a,remainAmount);
		    }
		    amount = remainAmount;
		}

	}
}
