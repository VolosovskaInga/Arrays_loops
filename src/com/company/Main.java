package com.company;

import java.util.Scanner;

public class Main {

    static void assignment1() {
        int[] grade = new int[]{5, 3, 7, 6, 2, 8};


        //Print out each element using for loop;
        System.out.println("All elements are ");
        for (int i = 0; i < 6; i++)
            System.out.println(grade[i]);

        //Print out each element using for each loop;
        System.out.println("All elements using for each loop are ");
        for (int tempVar : grade)
            System.out.println(tempVar);

        //Print out each element using while loop;
        System.out.println("All elements using while loop ");
        int i = 0;
        while (i < grade.length) {
            System.out.println(grade[i]);
            i++;
        }

        //Print out each element using do while loop;
        //System.out.println("All elements using do while loop ");
        //int i = 0;
        //do
        //{
        //    System.out.println(grade[i]);
        //    i++;
        // }
        //while(i < grade.length);

        // I think the easiest way to print out all elements is by using Loop: for each.
        // It is the easiest to write in code.


    }

    static void assignment2() {
        int[] grade = new int[]{10, 4, -4, 7, 0, 9, 1, 3, 7, -5};
        //Print out elements which are negative.
        int ctr_odd = 0;
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] < 0) {
                System.out.println("Negative element is " + grade[i]);//
            }
        }
        //Print out elements which are negative.
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] % 2 != 0) {
                System.out.println("Odd element is " + grade[i]);
            }
        }

        //Verify if there are multiple elements with the same value
        System.out.println("Element with the same value: ");
        for (int i = 0; i < grade.length; i++) {
            for (int c = i + 1; c < grade.length; c++) {
                if (grade[i] == grade[c])
                    System.out.println(grade[c]);
            }
        }
        //Print out each second element.
        System.out.println("Every other element is: ");
        for (int i = 0; i < grade.length; i = i + 2)
            System.out.println(grade[i]);

        //Compute average value of the array.
        float avgGrade = (grade[0] + grade[1] + grade[2] + grade[3] + grade[4] + grade[5] + grade[6] +
                grade[7] + grade[8] + grade[9]) / 9.0f;
        System.out.println("The average value of the array is: " + avgGrade);

        //Establish how many elements are smaller than average value.
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] < 3.5) {
                System.out.println("Element that is smaller than average value " + grade[i]);


            }
        }
    }

    static void assignment3() {

        byte[] gradeArray = new byte[10];
        byte enteredGrades = 0;
        byte newGrade = 0;
        byte failed = 0;
        byte excellentGrade = 0;


        Scanner input = new Scanner(System.in);

        while (enteredGrades < 10) {
            System.out.println("Enter grade from 0 to 10");
            newGrade = input.nextByte();

            if (newGrade < 0 || newGrade > 10) {
                System.out.println("Invalid grade! Possible grades are from 0 to 10. Please enter valid grade");
            } else {
                gradeArray[enteredGrades] = newGrade;
                enteredGrades++;
            }
        }
        for (int i = 0; i < gradeArray.length; i++) {

            if (gradeArray[i] < 4) {
                failed++;
            }
            if (gradeArray[i] == 10) {
                excellentGrade++;
            }

        }
        System.out.println(failed + " students failed!");
        System.out.println(excellentGrade + " students got an A");

        // Print the histogram
        System.out.println();
        System.out.println("HISTOGRAM");

        for (int i = 0; i < gradeArray.length-1; i++) {
            byte howManyTimes = 0;
            for (int j = 0; j < gradeArray.length; j++) {
                if (gradeArray[j] == i) {
                    howManyTimes++;
                }
            }

                System.out.println(howManyTimes + " students with the grade " + i);
        }

    }


    public static void main(String[] args) {
        //assignment1();
        //assignment2();
        assignment3();


    }
}


