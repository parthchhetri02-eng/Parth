
/**
 * Write a description of class qn4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class qn4
{
  

    
   
    byte byteVal;
    short shortVal;
    int intVal;
    long longVal;

    float floatVal;
    double doubleVal;

    char charVal;
    boolean booleanVal;

    public static void main(String[] args) {

      
        qn4 dv = new qn4();

        System.out.println("Default byte: " + dv.byteVal);
        System.out.println("Default short: " + dv.shortVal);
        System.out.println("Default int: " + dv.intVal);
        System.out.println("Default long: " + dv.longVal);

        System.out.println("Default float: " + dv.floatVal);
        System.out.println("Default double: " + dv.doubleVal);

        System.out.println("Default char (printed between brackets): [" + dv.charVal + "]");
        System.out.println("Default boolean: " + dv.booleanVal);



}
}