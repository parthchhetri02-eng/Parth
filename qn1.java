
/**
 * Write a description of class qn1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qn1
{
    
    public static void main(String[] args) {

        
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  
        System.out.println("a - b = " + (a - b));  
        System.out.println("a * b = " + (a * b));  
        System.out.println("a / b = " + (a / b));  
        System.out.println("a % b = " + (a % b));  
        int x = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++));  
        System.out.println("After x++: " + x);
        System.out.println("++x = " + (++x));  
        int y = 10;
        System.out.println("\nAssignment Operators:");
        y += 5;      
        System.out.println("y += 5 → " + y);
        y *= 2;      
        System.out.println("y *= 2 → " + y);
        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        boolean p = true, q = false;
        System.out.println("\nLogical Operators:");
        System.out.println("p && q: " + (p && q)); 
        System.out.println("p || q: " + (p || q)); 
        System.out.println("!p: " + (!p));         
        int num = 7;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("\nTernary Operator:");
        System.out.println(num + " is " + result);
    }

}