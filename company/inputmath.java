package com.company;
import java.util.Scanner;
public class inputmath
{
    public static void putin()
    {
        Scanner my = new Scanner(System.in);

        System.out.println("Enter first number ");
        int a = my.nextInt();

        System.out.println("Enter second number ");
        int b = my.nextInt();

        int Total=a*b;
        System.out.print("\nThis is your total:" + Total);
    }
}
