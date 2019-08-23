/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnjava;

/**
 *
 * @author AL AMIN
 */
public class Typecusting {
    
    public static void main(String arg[]){
        int id = 943859458;
        System.out.println("Integer is = "+id);
        //cust to double 
        double iddb = (double) id;
        System.out.println("Double is = "+ iddb);
        // cust to float 
        float idfl = (float) id;
        System.out.println("float is = "+idfl);
        //cust float to integer
        int idint = (int) idfl;
        System.out.println("Float to integer = "+idint);
        // cust double to integer
        int idtodb = (int)iddb;
        System.out.println("Double to int = " + idtodb);
    }
}
