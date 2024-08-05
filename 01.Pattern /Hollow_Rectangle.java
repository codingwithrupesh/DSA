import java.util.Scanner;

import java.io.*;

public class Hollow_Rectangle{
    public static void Hollow_Rectangle(int x , int y){
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if( i == 1 | i == x | j == 1 | j == y){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner v = new Scanner(System.in);
        System.out.print("Enter no. of rows in a Hollow Rectangle pattern   ");
        int n = v.nextInt();
        System.out.print("Enter no. of columns in a Hollow Rectangle Pattern  ");
        int m = v.nextInt();
        Hollow_Rectangle(n, m);
    }
}