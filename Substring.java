/*
>>>Input Format

The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.

>>>Output Format

Print the substring in the inclusive range from start to end-1.

>>>Sample Input

Helloworld
3 7

>>>Sample Output

lowo

>>>Problem URL:
https://www.hackerrank.com/challenges/java-substring/problem?isFullScreen=true
----------------------------------------------




>>>Solution
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
}

