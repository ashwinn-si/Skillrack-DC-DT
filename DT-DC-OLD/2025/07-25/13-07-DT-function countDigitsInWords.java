
/*
The function/method countDigitslnWords accepts an argument str representing a string value.
The function/method countDigitslnWords must return an integer representing the count of single-digit word
representations (zero, one, two, three, four, five, six, seven, eight and nine) that can be formed using the
alphabets in the given string by ignoring the case.
Your task is to implement the function countDigitslnWords so that the program runs successfully.
IMPORTANT:
Do not write the main() function as it is already defined.
Example Input/Output 1:
Input:
zinc copper sulphate
Output:
3
Explanation:
The single-digit word representations that can be formed using the alphabets in the given string are
zero, one and three.
 */


import java.util.*;

public class Main {
  static HashMap<Integer, String> hash = new HashMap<>();

  static int countDigitsInWords(String[] string) {
    int alphabets[] = new int[26];
    for (String str : string) {
      for (char ch : str.toCharArray()) {
        alphabets[ch - 'a']++;
      }
    }
    int count = 0;
    for (Integer num : hash.keySet()) {
      String digit = hash.get(num);
      boolean flag = true;
      int alphabetsCpy[] = alphabets.clone();
      for (char ch : digit.toCharArray()) {
        if (alphabetsCpy[ch - 'a'] == 0) {
          flag = false;
          break;
        } else {
          alphabetsCpy[ch - 'a']--;
        }
      }
      if (flag) {
        count++;
      }
    }
    return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String[] str = sc.nextLine().strip().split(" ");
    hash.put(0, "zero");
    hash.put(1, "one");
    hash.put(2, "two");
    hash.put(3, "three");
    hash.put(4, "four");
    hash.put(5, "five");
    hash.put(6, "six");
    hash.put(7, "seven");
    hash.put(8, "eight");
    hash.put(9, "nine");
    System.out.println(countDigitsInWords(str));
  }
}