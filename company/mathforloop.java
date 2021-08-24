package com.company;

import java.util.Scanner;

public class mathforloop
{
    public static void loopit()
    {
        Scanner llo = new Scanner(System.in);

        int count= 1;
        int length =10;
        int tot;

        System.out.println("\nEnter test number ");
        int a = llo.nextInt();

        for( int i=0; i < length; i++)
        {
            tot= a*count;
            count++;
            System.out.println(tot);
        }

    }
}
