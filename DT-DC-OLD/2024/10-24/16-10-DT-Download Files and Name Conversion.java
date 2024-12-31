/*A boy wants to download N files from a drive (online storage) and he wants to store them in
his laptop. If a file is downloaded again, then the file is saved with a different name by adding
(i) to the original file name, where i represents the number of times it is downloaded again.
The program must accept the names of the N files that the boy wants to download from the
drive as the input. The program must print the names of the N files after downloading from the
drive as the output.

Input:
7
mybio.txt
profile.jpeg
mybio.txt
mybio.txt
profile.pdf
profile.jpeg
mybio.odt
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		
		int N=sc.nextInt();
		
		sc.nextLine();
		
		HashMap<String,Integer> hash=new HashMap<>();
		
        for(int i=0;i<N;i++){
            String currString =sc.nextLine();
            if(hash.get(currString)==null){
                System.out.println(currString);
                hash.put(currString,0);
            }else{
                System.out.printf("%s(%d)%s\n",currString.substring(0,currString.indexOf(".")),hash.get(currString)+1,currString.substring(currString.indexOf(".")));
                hash.put(currString,hash.get(currString)+1);
            }
        }
	}
}