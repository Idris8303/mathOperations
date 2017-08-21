package com.tiy;
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        int x, y, z;
        System.out.println("Enter two numbers to calculate their sum ");
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x + y;
        System.out.println("the sum of your two numbers is = "+z);
    }
}
