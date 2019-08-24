
package learnjava;

/**
 *
 * @author AL AMIN
 * @Syntex
 * @if(condition == true){
 * @execute a block of code;
 * }
 */
public class ConditionalStatement {
    public static void main(String arg[]){
        int num = 100;
        // if else statement 
        if(num >= 80){
            System.out.println("GPA: 5.00");
        }else{
            System.out.println("Fail 0.00");
        }
        
        //Short Hand If...Else (Ternary Operator)
        double result;
        result = (num >= 33)? 1.50086767:0;
        System.out.println(Math.round(result));
    }
}
