/*There are N students in a class. All students have written the science exam in theoretical and
experimental laboratory format. The marks allocated for the theoretical exam is 75. The marks
allocated for the experimental laboratory is 25. So the total marks is 100. A student has passed
the exam only if he/she scored at least 50% in both theoretical and experimental laboratory
formats. The program must accept the gender (M or F) and the marks scored in theoretical T,
experimental laboratory E for each student as the input. The program must print the overall
pass percentage of the class with the precision up to two decimal places. Then the program
must print the pass percentage of male and female students separately with the precision up
to two decimal places.
Note: At least one male student and one female student are always present in the class.
*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		int totalF=0;
		int totalM=0;
		int passF=0;
		int passM=0;
		for(int i = 0 ; i < N; i++){
		    char ch = sc.next().charAt(0);
		    int thoery = sc.nextInt();
		    int pratical = sc.nextInt();
		    if(thoery >= 37.5 && pratical >= 12.5){
		        if(ch=='M'){
		            passM++;
		        }else{
		            passF++;
		        }
		    }
		    if(ch=='M'){
		        totalM++;
		    }else{
		        totalF++;
		    }
		}
		System.out.printf("%.2f\n",((passM+passF)/((totalM+totalF)*1.0))*100);
		System.out.printf("%.2f\n",((passM/(totalM*1.0))*100));
		System.out.printf("%.2f\n",((passF/(totalF*1.0))*100));
	}
}