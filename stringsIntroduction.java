/*
>>>Input format

The first line contains a string A. The second line contains another string B. The strings are comprised of only lowercase English letters.

>>>Output format

There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

>>>Sample Input 0

hello
java

>>>Sample Output 0

9
No
Hello Java

>>>Problem URL
https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
-------------------------------------------





>>> Solution
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
        if((A.compareTo(B))>0){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    //   String firstLetA = A.substring(0,1);
    //   String firstLetB = B.substring(0,1);
    //   String remLetA = A.substring(1);
    //   String remLetB = B.substring(1);
    //   String firstLetCapsA = firstLetA.toUpperCase();
    //   String firstLetCapsB = firstLetB.toUpperCase();
        
    //   String newA = firstLetCapsA+remLetA;
    //   String newB = firstLetCapsB+remLetB;
        
    //   String word = newA+" "+newB;
    //   System.out.println(word);
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
        
    }
}




