package mypack;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;
//import java.util.*; this will import all functions



public class Main {




    public static void main(String[] args){
        Date now = new Date();
        System.out.println(now);





        //Student std = new Student();
        HonorStudent hstd = new HonorStudent();
        GoodStudent gstd = new GoodStudent();
        System.out.print("Enter your name here : ");
        Scanner scan = new Scanner(System.in);
        String setterName = scan.nextLine();

        hstd.setName(setterName);
        String getIT = hstd.getName();

        if(getIT.charAt(0) == 'S' || getIT.charAt(0) == 's') {
            hstd.displayMessage();

        }
        else{
            gstd.displayMessage();
        }


        System.out.println("My name is " + getIT);
        //std.setName(setterName);
        //String getIT = std.getName();

        //Student.displayMessage();
       // System.out.println("My name is " + getIT);




//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        System.out.println("Your age " + age);
//
//        Scanner scanner1 = new Scanner(System.in);
//        String hello = scanner1.nextLine();
//        System.out.println(hello);







    }
}
