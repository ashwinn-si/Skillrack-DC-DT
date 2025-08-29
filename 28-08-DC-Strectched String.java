public class 28-DC-Strectched String {
   public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		int index = 0;
		int minLength = Integer.MAX_VALUE;
		int N1 = s1.length(), N2 = s2.length();
		
		while(index < N2){
		    int currIndex = index;
		    while(currIndex < N2 && s2.charAt(currIndex) == s2.charAt(index)){
		        currIndex++;
		    }
		    minLength = Math.min(currIndex - index, minLength);
		    index = currIndex;
		}
	    index = 0;
	    for(char ch: s1.toCharArray()){
	        int end = index + minLength;
	        while(index < end){
	            if(index >= N2){
	                System.out.print("No");
	                return;
	            }
	            if(s2.charAt(index) != ch){
	                System.out.print("No");
	                return;
	            }
	            index++;
	        }
	    }
	    if(index != N2){
	        System.out.print("No");
	        return;
	    }
	    System.out.print("Yes");

	}
}
