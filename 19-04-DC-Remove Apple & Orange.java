/*
The program must accept a character matrix of size R*C containing only A's and Os as the input. The character A
represents an apple. The character O represents an orange. The program must remove the fruits in the matrix based
on the following conditions.
- Only the fruits in the last row of the matrix are allowed to be removed.
- If the number of apples is greater than or equal to the number of oranges in the last row, then the program must
remove the apples from the last row. Else the program must remove the oranges from the last row.
- Once a fruit is removed, the fruits above the empty space will move down by one position.
The program must print the matrix after removing the fruits T times as the output. The value of T is also passed as the
input to the program. The empty spaces must be printed as asterisks.

Input:
6 5
A O O A O O
O A O A A A
A A O A A O
O A O O A O
O A A A O A
3

Output:
* * * * * 
* * * A * 
* * O O * 
A O A A O 
O O A O A 
A A O O O 

 */

import java.util.*;
public class Hello {
    static List<List<Character>> matrix;
    static int pointers[];
    
    static void helper2(int C, char ch){
        for(int i = 0 ; i < C ; i++){
            if(matrix.get(i).get(pointers[i]) == ch){
                matrix.get(i).set(pointers[i],'*');
                pointers[i] -= 1;
            }
        }
    }
    
    static Count helper1(int C){
        int orange = 0;
        int apple = 0;
        for(int i = 0 ; i < C ; i++){
            if(matrix.get(i).get(pointers[i]) == 'O'){
                orange++;
            }else{
                apple++;
            }
        }
        return new Count(orange, apple);
    }
    

    static void mainHelper(int C){
        Count c = helper1(C);
        if(c.apple >= c.orange){
            helper2(C, 'A');
        }else{
            helper2(C, 'O');
        }
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		matrix = new ArrayList<>();
		for(int i = 0 ; i < R ; i++){
		    for(int j = 0 ; j < C ; j++){
		        if(i == 0){
		            matrix.add(new ArrayList<>(Arrays.asList(sc.next().charAt(0))));
		        }else{
		            matrix.get(j).add(sc.next().charAt(0));
		        }
		    }
		}
		pointers = new int[C];
		Arrays.fill(pointers, R-1);
		int N = sc.nextInt();
		for(int i = 0 ; i < N; i++){
		    mainHelper(C);
		}
		for(int i = 0; i < R ; i++){
		    for(int j = 0; j < C ; j++){
		        System.out.print(matrix.get(j).get((pointers[j] + i + 1) % R)+" ");
		    }
		    System.out.println();
		}
	    
	}
}
class Count{
    int orange, apple;
    Count(int orange, int apple){
        this.orange = orange;
        this.apple = apple;
    }
}