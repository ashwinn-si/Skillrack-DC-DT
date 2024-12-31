/*There are N passengers in a ship. The ship collides with an iceberg and slowly sinking into the sea. The passengers must
be evacuated from the ship based on the following conditions.
- Every minute, only one person can evacuate from the Ship.
- Children should be given high priority, then women and men.
The program must accept the name and the category(children, women and men) of N passengers and an integer X as
the input. The program must print the number Of children, women and men who can be evacuated from the ship within X
minutes as the output.
Boundary Condition(s):
1 G N, X 100
1 Length of the passenger's name 25
Input Format:
The first line contains N.
The next N lines, each containing the name and the category Of a passenger separated by a space.
The (N+2)nd line contains X.
Output Format:
The first line contains three integers representing the number of children, women and men who can be evacuated from
the ship within X minutes.
Example Input/Output 1:
Input:
7
xyz men
ABCD children
Abc women
PQRS women
EFG children
Mno children
ijk men
4
Output:
3 1 0*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		String name,cat;
		int women_count=0;
		int child_count=0;
		int men_count=0;
		for(int i=0;i<N;i++){
		    name=sc.next();
		    cat=sc.next();
		    if(cat.equals("women")){
		        women_count++;
		    }else if(cat.equals("men")){
		        men_count++;
		    }else{
		        child_count++;
		    }
		}
		int time_left=sc.nextInt();
              int count[]={0,0,0};
            while(time_left !=0 && child_count !=0){
                time_left--;
                child_count--;
                count[0]++;
            }
            while(time_left !=0 && women_count !=0){
                women_count--;
                time_left--;
                count[1]++;
            }
            while(time_left !=0 && men_count !=0){
                men_count--;
                time_left--;
                count[2]++;
            }
            System.out.printf("%d %d %d",count[0],count[1],count[2]);


	}
}
