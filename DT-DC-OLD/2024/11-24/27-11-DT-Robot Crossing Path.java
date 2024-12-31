/*
The program must accept a string S representing the movement of a robot as the input. The string S
containing the characters N, E, S and W. Initially, the robot is present at the centre (O, O) of an infinite plane.
For each character CH in the S, the robot moves in the infinite plane based on the following
conditions.
- If CH is N. then the robot moves 1 unit towards North.
- If CH is E, then the robot moves 1 unit towards East.
- If CH is S, then the robot moves 1 unit towards South.
- If CH is W. then the robot moves 1 unit towards West.
The program must print YES if the robot crosses its path. Else the program must print NO as the output

Input:
NNNNWWWWWSSSEEEEE

Output.
YES
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		ArrayList<ArrayList<Integer>> allPos = new ArrayList<>();
		int currI = 0 ;
		int currJ = 0 ;
		ArrayList<Integer> initial = new ArrayList<>();
		initial.add(0);
		initial.add(0);
		allPos.add(initial);
		for(int i = 0 ; i < S.length() ; i++){
		    if(S.charAt(i) == 'N'){
		        currI++;
		    }else if(S.charAt(i) == 'S'){
		        currI--;
		    }else if(S.charAt(i) == 'E'){
		        currJ++;
		    }else{
		        currJ--;
		    }
		    ArrayList<Integer> currPos = new ArrayList<>();
		    currPos.add(currI);
		    currPos.add(currJ);
		    if(allPos.contains(currPos)){
		        System.out.printf("YES");
		        return;
		    }
		    allPos.add(currPos);
		}
		System.out.printf("NO");

	}
}