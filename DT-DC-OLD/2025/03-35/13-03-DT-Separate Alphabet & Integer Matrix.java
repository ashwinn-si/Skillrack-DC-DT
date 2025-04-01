
/*
The program must accept a matrix of size R*C containing alphabets and integers as the input. For each
column in the given matrix, the program must separate the alphabets and the integers so that the column
contains all the alphabets followed by all the integers in the order of their occurrence. Finally, the program
must print the modified matrix as the output.

Input:
12 45 b 78 15 32
34 n 54 dyp
k 45 60 t 80 90
a 50 g r 15 w

Output:
knbdyp
a 45 g t 15 w
12 45 54 r 80 32
34 50 60 78 15 90
*/

import java.util.*;

public class Hello {

    public static void main(String[] args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        List<colContent> colObj = new ArrayList<>();

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                String str = sc.next();
                Character ch = str.charAt(0);
                if (i == 0) {
                    colObj.add(new colContent());
                }
                if (Character.isLetter(ch)) {
                    colObj.get(j).addAlphabet(str);
                } else {
                    colObj.get(j).addNumber(str);
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                colContent obj = colObj.get(j);
                if (obj.getSizeAlphabets() > 0) {
                    System.out.print(obj.getAlphabet() + " ");
                } else {
                    System.out.print(obj.getNumber() + " ");
                }
            }
            System.out.println();
        }

    }
}

class colContent {
    Queue<String> alphabets;
    Queue<String> numbers;

    colContent() {
        alphabets = new LinkedList<>();
        numbers = new LinkedList<>();
    }

    void addAlphabet(String ch) {
        alphabets.offer(ch);
    }

    void addNumber(String ch) {
        numbers.offer(ch);
    }

    int getSizeAlphabets() {
        return alphabets.size();
    }

    int getSizeNumbers() {
        return numbers.size();
    }

    String getAlphabet() {
        return alphabets.poll();
    }

    String getNumber() {
        return numbers.poll();
    }
}