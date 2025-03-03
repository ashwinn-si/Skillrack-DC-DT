import java.util.*;
public class Hello {
    
    static boolean isUpperCase(char ch){
        return (ch >= 'A' && ch <= 'Z');
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int N1 = str1.length() , N2 = str2.length(), flag = 1;
		boolean arr2[] = new boolean[N2];
		
		for(int i = 0 ; i < N2 ; i++) arr2[i] = isUpperCase(str2.charAt(i));
		
		for(int i = 0 ; i <= N1 - N2 ; i++){
		    boolean arr1[] = new boolean [N2];
		    for(int j = i ; j < i + N2 ; j++){
		        arr1[ j - i ] = isUpperCase(str1.charAt(j));
		    }
		    if(Arrays.equals(arr1,arr2)){
		        System.out.println(str1.substring(i , i + N2));
		        flag = 0;
		    }
		}
		if(flag == 1) System.out.print("-1");
	}
}