
package com.mycompany.studentgradecalculator;

import java.util.Scanner;


public class StudentGradeCalculator {

    public static void main(String[] args) {
        
        
         Scanner scanner = new Scanner(System.in);
     
      System.out.println("please enter your mark (out of 100) for your first subject");
      int mark1= scanner.nextInt();
       System.out.println("please enter your mark (out of 100) for your second subjec");
      int mark2= scanner.nextInt();
       System.out.println("please enter your mark (out of 100) for your third subjec");
      int mark3= scanner.nextInt();
       System.out.println("please enter your mark (out of 100) for your fourth subjec");
      int mark4= scanner.nextInt();
       System.out.println("please enter your mark (out of 100) for your fifth subjec");
      int mark5= scanner.nextInt();
      System.out.println("please enter your mark (out of 100) for your sixth subjec");
      int mark6= scanner.nextInt();
      System.out.println("please enter your mark (out of 100) for your seventh and final subjec");
      int mark7= scanner.nextInt();
      scanner.close();
      int sum = mark1+ mark2+ mark3+ mark4+ mark5 + mark6 + mark7;
      int average = sum/7;
      String percentage = String.format("%d%%",average);
    
      
       char grade;
        int avg = (int) average / 10; 

        switch (avg) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                grade = 'F';
                break;
            case 5:
                grade = 'E'; 
                break;
            case 6:
                grade = 'D'; 
                break;
            case 7:
                grade = 'C'; 
                break;
            case 8:
                grade = 'B'; 
                break;
            case 9:
            case 10:
                grade = 'A'; 
                break;
            default:
                grade = 'X'; 
        }
        
        System.out.println("your Total is: " + sum +" /700");
        System.out.println("your Average percentage is: " + percentage);
        System.out.println("Your Grade is: " + grade);
    }
}



