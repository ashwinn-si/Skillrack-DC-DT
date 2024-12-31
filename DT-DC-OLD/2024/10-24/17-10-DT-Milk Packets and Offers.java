/*In a milk shop, if a customer gives X empty milk packets to the shop, the shopkeeper will give
I full milk packet to the customer. The program must accept two integers N and X as the
input. The integer N represents the number of full milk packets held by a customer. The
program must print the maximum number of full milk packets that the customer can get using
the milk packets recursively as the output.

Input:
14 3

Output:
20

Explanation:
Here N = 14 and X = 3.
The one of the possible ways to get the maximum number of full milk packets is given below.
Initially, he has 14 full milk packets.
After using the 14 full milk packets, he has 14 empty milk packets.
If he returns 12 empty milk packets, he will get 4 full milk packets.
After using the 4 full milk packets, he has 6 (2 + 4) empty milk packets.
If he returns 6 empty milk packets, he will get 2 full milk packets.
After using the 2 full milk packets, he has 2 empty milk packets.
Now he cannot get any full milk packets with these 2 empty milk packets.
So the maximum number of full milk packets that the customer can get is 20 (14 + 4 + 2).
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		
		Scanner sc=new Scanner(System.in);
		
		int fullPacket=sc.nextInt();
		
		int exchangePacket=sc.nextInt();
		
		int result=helper(fullPacket,exchangePacket);
		
		System.out.printf("%d",result+fullPacket);
	}
	
	static int helper(int emptyPacket,int exchangePacket){
	    
	    if(emptyPacket<exchangePacket){
	        return 0;
	    }
	    
	    return (int)emptyPacket/exchangePacket+helper((emptyPacket%exchangePacket)+(int)(emptyPacket/exchangePacket),exchangePacket);
	    
	}
}