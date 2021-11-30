/*
>>>Input Format

Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

>>>Output Format

In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

>>>Sample Input

java 100
cpp 65
python 50

>>>Sample Output

================================
java           100 
cpp            065 
python         050 
================================

>>>Problrm URL:
https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
--------------------------------------------------




>>>Solution:
*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d\n",s1,x);
                                   /* ("%-15s%03d%n", s1, x) % : used as a formatter. '-' : minus sign used for left indentation of the string.
                                      15s : here 15 denotes the string's minimum field width 15. '0' : pads the extra 0s in the integer. 
                                      3d : here 3 denotes integer's minimum field width 3. %n : prints the new line. 
                                      As, System.out.println() does not support this format, so printf() format is used. */
            }
            
            System.out.println("================================");

    }
}

