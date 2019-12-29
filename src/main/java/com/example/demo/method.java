
/*
let the user add the number and display all the grades

*/

package com.example.demo;

import java.util.Scanner;

public class method {
public static void main(String[]args) {
    System.out.println( "Enter the number" );
    Scanner input = new Scanner( System.in );
int grade= input.nextInt();


        if (grade > 90) {
            //int gradA = input.nextInt();
            System.out.print( "A" );
        } else if (grade > 80 && grade <= 90) {
          //  int gradB = input.nextInt();
            System.out.print( "B" );
        } else if (grade > 70 && grade <= 80) {
           // int gradC = input.nextInt();
            System.out.print( "C" );
        } else {
            System.out.print( "F" );


    }
    }

}
