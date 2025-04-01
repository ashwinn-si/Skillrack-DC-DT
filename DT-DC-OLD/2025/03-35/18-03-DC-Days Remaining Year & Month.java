
/*
The program must accept a date D in any of the following two formats.
DD-MMM-YYYY
MMM-DD-YYYY
The program must print the number of days remaining in the year Y YYY after the given date. Then the
program must print the number of days in the month MMM after the given date.
Note: The value of MMM will be from Jan, Feb, Mar, Apr,... till Dec.

Input:
09-Nov-2021

Output:
52
21

Explanation:
The given date is 9th November 2021.
Number of days remaining in the year 2021: 52 days
Number of days remaining in the month Nov-2021: 21 days
 */

import java.util.*;

public class Hello {
    static HashMap<String, Integer> hash = new HashMap<>();

    static boolean isLeapYear(int year) {
        return ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0);
    }

    static int[] calculateDates(int day, String month, int year, String monthsArray[]) {
        int monthIndex = 0;
        for (int i = 0; i < 12; i++) {
            if (monthsArray[i].equals(month)) {
                monthIndex = i;
            }
        }
        int res1 = 0;

        int result = 0;
        if (monthIndex == 1) {
            if (isLeapYear(year)) {
                result = 29 - day;
            } else {
                result = 28 - day;
            }
        } else {
            result = hash.get(monthsArray[monthIndex]) - day;
        }
        res1 = result;
        monthIndex++;

        for (int i = monthIndex; i < 12; i++) {
            if (i == 1) {
                if (isLeapYear(year)) {
                    result += 29;
                } else {
                    result += 28;
                }
            } else {
                result += hash.get(monthsArray[i]);
            }
        }

        return new int[] { res1, result };
    }

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String date[] = sc.nextLine().strip().split("-");
        hash.put("Jan", 31);
        hash.put("Feb", 29);
        hash.put("Mar", 31);
        hash.put("Apr", 30);
        hash.put("May", 31);
        hash.put("Jun", 30);
        hash.put("Jul", 31);
        hash.put("Aug", 31);
        hash.put("Sep", 30);
        hash.put("Oct", 31);
        hash.put("Nov", 30);
        hash.put("Dec", 31);
        String months[] = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
                "Dec" };

        // finding the format
        int result[];
        if (date[0].length() == 2) {
            result = (calculateDates(Integer.parseInt(date[0]), date[1], Integer.parseInt(date[2]), months));
        } else {
            result = (calculateDates(Integer.parseInt(date[1]), date[0], Integer.parseInt(date[2]), months));
        }
        System.out.print(result[0] + "\n" + result[1]);
    }
}