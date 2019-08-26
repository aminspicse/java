package learnjava;

/**
 *
 * @author AL AMIN
 */
public class JavaException {
    public static void main(String arg[]){
        try{
            int [] arr = {10,20,30,{}};
            
        }catch(Exception e){
            System.out.println("worong"+e);
        }finally{
            System.out.println("try catch is finished");
        }
    }
}
