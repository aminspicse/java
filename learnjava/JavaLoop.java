
package learnjava;

/**
 *
 * @author AL AMIN
 */
public class JavaLoop {
    public static void main(String arg[]){
        //while loop
        int i =1;
        System.out.println("While loop");
        while(i<= 10){
            System.out.print(i+" , ");
            i++;
        }
        System.out.println("\n-------------------------------------------------------");
        
        /// do while
        System.out.println("Do while loop");
        int j =1;
        do{
            System.out.print(j+" , ");
            j++;
        }
        while(j <= 5);
    }
}
