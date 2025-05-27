/*
Multiple Interfaces - Department and College
The program must accept the name, department
name and college name of a student as the input.
The program must print the name, department
name and college name as shown in the Example
Input/Output section. Please fill in the missing
lines of code so that the program runs
successfully.
Example Input/Output 1:
Input:
Hector
ECE
ABC College of Engineering
Output:
Name: Hector
Department: ECE
College: ABC College of Engineering
 */

import java.util.Scanner;

interface College {
    
    void printCollegeName(String name);
}

interface Department {
    
    void printDepartmentName(String name);
}

class Student implements College, Department {
    
    public void printStudentName(String name){
        
        System.out.println("Name: " + name);
    }
    
    @Override
    public void printDepartmentName(String name){
        
        System.out.println("Department: " + name);
    }
    
    @Override
    public void printCollegeName(String name){
        
        System.out.println("College: " + name);
    }
}// end of Student class

public class Hello {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        Student stud = new Student();
        
        stud.printStudentName(sc.nextLine());
        
        stud.printDepartmentName(sc.nextLine());
        
        stud.printCollegeName(sc.nextLine());
    }// end of main function
}// end of Hello class
```