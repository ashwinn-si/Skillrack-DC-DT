/*
The program must accept the date and revenue of N days as the input. The program must print dates in which the
revenue is greater than or equal to X as the output. The value of X is also passed as the input. The dates must be
printed in chronological order. If there is no such date, then the program must print -1 as the output.
Note: The format of the date will be DD-MMM-YYYY, where MMM will be like Jan, Feb, Mar,.... till Dec.

Input:
8
15-Jun-2020 750
17-Jun-2020 450
12-Jun-2020 150
18-Jun-2020 goo
16-Jun-2020 250
14-Jun-2020 500
19-Jun-2020 640
13-Jun-2020 350
500

Output:
14-Jun-2020
15-Jun-2020
18-Jun-2020
19-Jun-2020
 */

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        List<DateValue> dates = new ArrayList<>();
        List<String> months = new ArrayList<>(Arrays.asList("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"));
        
        for(int i = 0 ; i < N ; i++){
            String[] inputString = sc.nextLine().strip().split(" ");
            String[] dateStamp = inputString[0].strip().split("-");
            dates.add(new DateValue(Integer.parseInt(dateStamp[0]), months.indexOf(dateStamp[1]), Integer.parseInt(dateStamp[2]), Integer.parseInt(inputString[1])));
        }
        
        int compare = sc.nextInt();
        
        List<DateValue> result = new ArrayList<>();
        
        for(DateValue currDate : dates){
            if(currDate.value >= compare){
                result.add(currDate);
            }
        }
        
        if(result.size() == 0){
            System.out.print("-1");
            return;
        }
        
        Collections.sort(result, (a,b) -> {
        if(a.year != b.year) return Integer.compare(a.year, b.year);
        if(a.month != b.month) return Integer.compare(a.month, b.month);
        return Integer.compare(a.date, b.date);
       });
       
       for(DateValue a : result){
           System.out.printf("%02d-%s-%04d\n",a.date, months.get(a.month), a.year);
       }
    
	}
}
class DateValue{
    int value, date, month, year;
    DateValue(int date, int month, int year, int value){
        this.value = value;
        this.date = date;
        this.month = month;
        this.year = year;
    }
}