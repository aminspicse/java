package learnjava;

/**
 *
 * @author AL AMIN
 */
public class JavaMath {
    public static void main(String arg[]){
        double a = -5.95347584;
        int x = 10;
        int y = 11;
        int z = 64;
        // find max number in two vairable 
        System.out.println("Maximum number = "+ Math.max(x, y));
        
        //find minimun number of tow variable
        System.out.println("MInimum number = "+Math.min(x, y));
        
        // the square root of z
        System.out.println("the square root is = "+Math.sqrt(z));
        
        //absolute (positive) value
        System.out.println("absolute (positive) value is = "+Math.abs(a));
        
        // java generate random number between 0 and 1 
        System.out.println("Generate random number = "+ Math.random());
        
    }
}
