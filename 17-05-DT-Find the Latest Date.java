/*
The program must accept M integers, N string values and Y integers as the input. The M integers represent the days
in a month. The N string values represent the names of the months (Jan, Feb, Mar, Apr, till Dec). The Y integers
represent the years. The program must print the latest date that can be formed using the given days, months and years.
The date must be printed in the format DD-MMM-YYYY.

Input: 
3
10 3 14
2
Jun Jul
3
2005 2020 2021

Output
14-Jun-2021
 */

 import java.util.*;
public class Hello {
    
    static ArrayList<String> month = new ArrayList<>(Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov" ,"Dec"));
    static int daysMonth[] = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    static void inputGetter(Scanner sc, ArrayList<Integer> arr, boolean flag){
        int N = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < N ; i++){
            if(flag){
                String str = sc.next();
                arr.add(month.indexOf(str));
                continue;
            }
            arr.add(sc.nextInt());
        }
    }
    
    static boolean isLeapYear(int year){
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }
    
    static boolean isValid(int days, int month, int year){
        if(month == 1){
            return (isLeapYear(year) ? days <= 29 : days <= 28);
        }
        return (days <= daysMonth[month]);
    }
    
    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> days = new ArrayList<>();
		ArrayList<Integer> years = new ArrayList<>();
		ArrayList<Integer> months = new ArrayList<>();
		
        inputGetter(sc, days, false);
        inputGetter(sc, months, true);
        inputGetter(sc, years, false);
        
        Collections.sort(days, Collections.reverseOrder());
        Collections.sort(months, Collections.reverseOrder());
        Collections.sort(years, Collections.reverseOrder());
        
        for(int currYear: years){
            for(int currMonth: months){
                for(int currDay: days){
                    if(isValid(currDay, currMonth, currYear)){
                        System.out.printf("%02d-%s-%04d", currDay, month.get(currMonth), currYear);
                        return;
                    }
                }
            }
        }
	}
}