/*
>>>Task
   You are given a 6X6 2D array. An hourglass in an array is a portion shaped like this:
     a b c
       d
     e f g
   In this problem you have to print the largest sum among all the hourglasses in the array.

>>>Input Format
   There will be exactly 66 lines, each containing  integers seperated by spaces. Each integer will be between -9 and 9 inclusive.

>>>Output Format
   Print the answer to this problem on a single line.

>>>Sample Input

     1 1 1 0 0 0
     0 1 0 0 0 0
     1 1 1 0 0 0
     0 0 2 4 4 0
     0 0 0 2 0 0
     0 0 1 2 4 0
     
>>>Sample Output
    19
    
>>>Problem URL: https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
-----------------------------------------------------




>>>Solution
*/

import java.util.*;

public class Array_2D {
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum=0;
        int max = Integer.MIN_VALUE; //Integer.MIN_VALUE is a constant in the Integer class of java.lang package that specifies that stores the minimum possible value for any integer variable in Java.
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
}
