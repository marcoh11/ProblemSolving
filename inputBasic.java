import java.util.Scanner;
/* Input Format

There are 5 lines of input:

-The first line contains an integer.
-The second line contains a float.
-The third line contains a double.
-The fourth line contains a String.
-The fifth line contains a char.
Output Format
                    The input values are : 3 | 3.5 | 3.5555555 | Hello world | a
There are three lines of output:

Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; 
because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() 
will be reading the remainder of the integer line (which is empty).
*/
public class inputBasic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int variable; //4 bytes
        float variable2; //4bytes
        double variable3; // 8bytes
        String variable4; // it depends
        char variable5; //1 byte
        
        System.out.println("Input a int value");
        variable = Integer.parseInt(input.nextLine());
        System.out.println("Input a float value");
        variable2= Float.parseFloat(input.nextLine());
        System.out.println("Input a double value");
        variable3= Double.parseDouble(input.nextLine());
        System.out.println("Input a String");
        variable4= input.nextLine();
        System.out.println("Input a char");
        variable5= input.next().charAt(0);
        System.out.println("The input values are :" +variable+" | "+variable2+" | "+variable3+" | "+variable4+" | "+variable5);
        input.close();
    }
}
