package com.nt;

/**
 * Generate SquareRoot of a given number
 *
 */

 import java.util.Scanner;
 import java.lang.Math;
class SqrRoot 
{
    public static void main( String[] args )
    {
		Scanner sc = new Scanner(System.in);
        System.out.println( "Enter number to Find its Square Root::" );
		int n = sc.nextInt();
		System.out.println(Math.sqrt(n));
    }
}
