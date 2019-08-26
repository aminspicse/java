package learnjava;

/**
 *
 * @author AL AMIN
 */
public class JavaArray {
    public static void main(String arg[]){
        // one dimensional array
        String[] car = {"BMW","TATA","TOYOTA"};
        int leng = car.length;
        for(String i:car){
            System.out.println(i);
        }
        
        // multidimensional array
        int [][] number = {{10,20,30},{40,50}, {60,70}};
        for(int a = 0; a < number.length; ++a){
            for(int b = 0; b< number[a].length;++b){
                System.out.println(number[a][b]);
            }
        }
    }
}
