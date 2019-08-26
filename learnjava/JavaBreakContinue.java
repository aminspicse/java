
package learnjava;

/**
 *
 * @author AL AMIN
 */
public class JavaBreakContinue {
    public static void main(String arg[]){
        //int i =0;
        for(int i =0; i<10;i++){
            if(i == 5){
                //continue;
                System.out.println(i);
                break;
            }
            System.out.println(i);
        }
    }
}
