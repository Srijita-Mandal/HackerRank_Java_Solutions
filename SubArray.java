/*
>>>Task
   Given an array of n integers, find and print its number of negative subarrays on a new line.

>>>Input Format
   The first line contains a single integer,n , denoting the length of array A.
   The second line contains n space-separated integers describing each respective element, a(i), in array A.

>>>Output Format
   Print the number of subarrays of A having negative sums.

>>>Sample Input
     5
     1 -2 4 -5 1

>>>Sample Output
     9
     
>>>problem URL: https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
-------------------------------------------------------




>>>Solution
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for(int i=0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        
        int count =0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=A[j];
                //System.out.println(sum);
                if(sum<0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
