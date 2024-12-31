/*In a parking space, N vehicles are parked. The parking charge for each vehicle is calculated
based on how long it has been parked. The parking charge per hour may vary depending on
the type of vehicle, The parking charge of a vehicle is calculated based on the following
conditions.
- If a vehicle is parked for H hours and M minutes and the parking charge for the vehicle is P
rupees per hour, then the total parking charge is H * P if M is less than or equal to 30. Else the
total parking charge is (H + I) * P.
- If a vehicle is parked for less than or equal to 30 minutes, then the total parking charge is P.
The parking time (Hours:Minutes) and the parking charge per hour for each vehicle are passed
as the input to the program. The program must print the number of vehicles parked for more
than X hours and Y minutes. Then the program must print the number of vehicles charged
above Z rupees as the output.

Input:
4
02:45 10
03:20 25
02:55 15
05:30 35
3 15 50

Output:
2
2
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int no_vechiles=sc.nextInt();
		sc.nextLine();
		int result[]=new int[no_vechiles];
		int time[]=new int[no_vechiles];
		for(int i=0;i<no_vechiles;i++){
		    int hr,min,parking;
		    String curr_time[]=sc.next().split(":");
		    hr=Integer.parseInt(curr_time[0]);
		    min=Integer.parseInt(curr_time[1]);
		    parking=sc.nextInt();
		    if(hr==0 && min>0 && min<=30){
		        result[i]=parking;
		    }
		    else if(min>30){
		        result[i]=(hr+1)*parking;
		    }else{
		        result[i]=hr*parking;
		    }
		    time[i]=(hr*60*60)+(min*60);
		 }
		 sc.nextLine();
		 int target_hr=sc.nextInt();
		 int target_min=sc.nextInt();
		 int target_amount=sc.nextInt();
		 int result_1=0;
		 int result_2=0;
		 for(int i=0;i<no_vechiles;i++){
		     if(result[i]>target_amount){
		         result_2++;
		     }
		     if(time[i]>target_hr*60*60+(target_min*60)){
		         result_1++;
		     }
		 }
		 System.out.printf("%d\n%d",result_1,result_2);
	}
}