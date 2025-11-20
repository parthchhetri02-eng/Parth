
/**
 * Write a description of class h here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class aayushpasal
{   public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter name of medicine");
    String s=in.nextLine();
    System.out.println("Enter price per tablet in NRP: ");
    double d=in.nextDouble();
    System.out.println("Input number of tablets:");
    int n=in.nextInt();
    double f=d*n;
    System.out.println("Total price of tablets are : "+f);
    System.out.println("Welcome to Aushadhi Pasal \n We have a total of "+n+" number of tablets with NRP cost as: "+f+ " We are always on stock \n Please visit again");
}
}