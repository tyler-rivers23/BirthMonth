//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int birthMonth;
        String birthMonthString;

        Scanner in = new Scanner(System.in);
        String trash = "";

        System.out.print("Enter your birth month:");
        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            in.nextLine();


         switch (birthMonth)
           {
            case 1:
                birthMonthString = "January";
                System.out.println("Your birth month is " + birthMonthString);
                break;

            case 2:
                birthMonthString = "February";
                System.out.println("Your birth month is " + birthMonthString);
                break;

            case 3:
                birthMonthString = "March";
                System.out.println("Your birth month is " + birthMonthString);
                break;

            case 4:
                birthMonthString = "April";
                System.out.println("Your birth month is " + birthMonthString);
                break;

            case 5:
                birthMonthString = "May";
                System.out.println("Your birth month is " + birthMonthString);
                break;

            case 6:
                birthMonthString = "June";
                System.out.println("Your birth month is " + birthMonthString);
                break;

            case 7:
                birthMonthString = "July";
                System.out.println("Your birth month is " + birthMonthString);
                break;

            case 8:
                birthMonthString = "August";
                System.out.println("Your birth month is " + birthMonthString);
                break;

            case 9:
                birthMonthString = "September";
                System.out.println("Your birth month is " + birthMonthString);
                break;

            case 10:
                birthMonthString = "October";
                System.out.println("Your birth month is " + birthMonthString);
                break;

            case 11:
                birthMonthString = "November";
                System.out.println("Your birth month is " + birthMonthString);
                break;

            case 12:
                birthMonthString = "December";
                System.out.println("Your birth month is " + birthMonthString);
                break;

               default:
                   System.out.println("You entered an invalid month : " + birthMonth);
          }

        }
          else
         {
            trash = in.nextLine();
            System.out.println("You entered an invalid number :" + trash);
         }
    }
}