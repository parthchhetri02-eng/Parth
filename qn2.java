import java.util.*;

/**
 * Write a description of class qn2 here.
 *
 * @author (Parth Chhetri)
 * @version (a version number or a date)
 */
public class qn2
{
          public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        int grade = input.nextInt();
        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("Result: " + result);

        input.close();
    }
    
}
    
