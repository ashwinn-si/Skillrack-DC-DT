/*
The program must accept a string S containing multiple words as the input. The program must group the words ending
with the same alphabet. The groups must be sorted based on the last alphabet and the words in each group must be
sorted in the order of their occurrence. Finally, the program must print the groups of words as the output.
Note: The string S contains only lower case alphabets and spaces.

Input:
pot mobile tent mango rabbit eagle fire giant apple

Output:
mobile eagle fire apple
mango
pot tent rabbit giant
 */

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		TreeMap<Character, ArrayList<String>> hash = new TreeMap<>();
        for(String str: sc.nextLine().strip().split(" ")){
            char lastChar = str.charAt(str.length() - 1);
            hash.putIfAbsent(lastChar, new ArrayList<>());
            hash.get(lastChar).add(str);
        }
        for(Character ch : hash.keySet()){
            for(String str: hash.get(ch)){
                System.out.print(str+" ");
            }
            System.out.println();
        }
	}
}