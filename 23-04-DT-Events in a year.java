import java.util.*;
public class Hello {
    
    static boolean isLeapYear(int year){
        return(year % 400 == 0 || (year % 100 != 0 && year % 4 == 0));
    }

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int inc = N;
	    int year = sc.nextInt();
	    HashMap<String, Integer> monthsDays = new HashMap<>();
	    String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
	    for(int i = 1 ; i <= 12 ; i++){
	        if(i <= 7){
	            if(i == 2){
	               monthsDays.put(months[i - 1], (isLeapYear(year)) ? 29 : 28);
	               continue;
	            }
	            monthsDays.put(months[i - 1], (i % 2 == 1) ? 31 : 30);
	        }else{
	            monthsDays.put(months[i - 1], (i % 2 == 0) ? 31 : 30);
	        }
	    }
	    
	    int [] prefixSum = new int[12];
	    for(int i = 0 ; i < 12 ; i++){
	        prefixSum[i] = prefixSum[Math.max(0, i - 1)] + monthsDays.get(months[i]);
	    }
	    int preIndex  = 0;
	    while((isLeapYear(year) && N <= 366 )|| N <= 365){
	        while(N > prefixSum[preIndex]){
	            preIndex++;
	        }
	        int days = (preIndex == 0) ? N : N - prefixSum[preIndex - 1];
	        System.out.printf("%02d-%s-%04d\n",days , months[preIndex],year);
	        N += inc;
	    }
	}
}