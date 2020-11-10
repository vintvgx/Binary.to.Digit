

package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);
        String code = "1-0-0-1";
        String[] arrOfCode = code.split("-", 4);
        int total =0;
        int a = 0;

        System.out.println("Welcome to Binary to Digit\nTo start conversion enter a 4 bit binary code and it will be converted to digits\n\nMake sure to enter binary code with dashes seperating bits as such ex.1-1-1-1");
        System.out.println("1. 4 bit number\n2. 8 bit number\n3. 16 bit number");
        a = scnr.nextInt();


        switch (a) {


            case (1):
                System.out.println("Enter binary number");
                code = scnr.next();
                arrOfCode = code.split("-", 4);
            int digit = 8;

            for (int i = 0; i < arrOfCode.length; i++) {


                if (arrOfCode[i].equals("1")) {
                    total = total + digit;
                }
                digit = digit / 2;

            }
            System.out.println("Total is = " + total);
            break;

            case (2):
                System.out.println("Enter binary number");
                code = scnr.next();
                arrOfCode = code.split("-", 8);
                int digit2 = 128;
                for (int i = 0; i < arrOfCode.length; i++) {


                    if (arrOfCode[i].equals("1")) {
                        total = total + digit2;
                    }
                    digit2 = digit2 / 2;

                }
                System.out.println("Total is = " + total);
                break;

            case (3):
                System.out.println("Enter digit number: ");
                int digCode = scnr.nextInt();
                StringBuilder bitCode = new StringBuilder("Binary: ");
                int dig = 8;
                int placement = 0;
                int i = 0;

                while (digCode != 0)
                {
                    placement = digCode;
                    digCode = digCode / dig;
                    dig = dig / 2;
                    System.out.println("Dig code 1 is: " + digCode);

                    if (digCode < 0)
                    {
                        System.out.println("Dig code 2 is: " + digCode);
                        placement = digCode;
                        bitCode.append('0');
                    }
                    else
                    {
                        bitCode.append('1');
                    }
                }

                System.out.println(bitCode);



        }
    }
}
