/*
The program must accept a character matrix of size 12*12 as the input. The 12 rows in the matrix represent the 12
hours (1 to 12) and the 12 columns in the matrix represent the minute slots (O, 5, 10, 15, till 55). The given character
matrix contains only asterisks, A's and P's. For each occurrence of A and P, the program must find the corresponding
time using the row and column position. Finally, the program must print the times in chronological order. The format of
the time must be HH:MM AM/PM.

INPUT:
* A * * * * * * * * * *
* * P * * * * * * * * *
* * * * A * * * * * * *
* * * * * P * * * * * *
* * * * * * * * * * * *
* * * * * * * * * * * *
* * * * * * * * * * * *
* * * * * * * A * * * *
* * * * * * * * * P * *
* A * * * * * * P * * *
* A * * * * A * * * * *
* A * * * * * * * * P *

OUTPUT:
12:05 AM
01:05 AM
03:20 AM
08:35 AM
10:05 AM
11:05 AM
11:30 AM
12:50 PM
02:10 PM
04:25 PM
09:45 PM
10:40 PM
 */

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Time> pq = new PriorityQueue<>(new CustomComparator());
        for(int hr = 0 ; hr < 12 ; hr++){
            for(int min = 0 ; min < 12 ; min++){
                char ch = sc.next().charAt(0);
                if(ch == '*'){
                    continue;
                }
                if(ch == 'A'){
                    // System.out.printf("%02d:%02d AM\n",hr + 1, min * 5);
                    int sec = ((hr + 1) * 60) + (min * 5);
                    if(hr + 1 == 12){
                        sec = min * 5;
                    }
                    pq.offer(new Time(hr + 1, min * 5, sec, "AM"));
                }else{
                    // System.out.printf("%02d:%02d PM\n",hr + 1, min * 5);
                    int sec = ((hr + 12 + 1) * 60) + (min * 5);
                    if(hr + 1 == 12){
                        sec = (12 * 60) + (min * 5);
                    }
                    pq.offer(new Time(hr + 1, min * 5, sec, "PM"));
                }
            }
        }
        while(!pq.isEmpty()){
            Time currTime = pq.poll();
            System.out.printf("%02d:%02d %s\n",currTime.hr, currTime.min, currTime.ch);
        }
	}
}

class Time{
    int hr, min, sec;
    String ch;
    Time(int hr, int min, int sec, String ch){
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        this.ch = ch;
    }
}

class CustomComparator implements Comparator<Time>{
    public int compare(Time t1, Time t2){
        return t1.sec - t2.sec;
    }
}