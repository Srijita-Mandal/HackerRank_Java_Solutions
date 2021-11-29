/*
>>>Task
In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line.

>>>Input Format

There are 3 lines of input, and each line contains a single integer.

>>>Sample Input

42
100
125

>>>Sample Output

42
100
125

>>>problem URL:
https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
-----------------------------------------------------------------



>>>Solution
*/
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}

