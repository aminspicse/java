package learnjava;

public class JavaString{
    
    public static void main(String arg[]){
        String name ="Md. Al Amin";
        System.out.println(name);
        
        // get string lenght
        System.out.println(name.length());
        
        // string to lower case
        System.out.println("String lower case = "+name.toLowerCase());
        
        //string uppercase
        System.out.println("String upper case = " +name.toUpperCase());
        
        // index of string
        System.out.println("index of string "+name.indexOf("Amin"));
        
        //string concatanation
        String fname = "Md.";
        String lname = "Al Amin";
        System.out.println("COncat string = "+fname+lname);
        //another waya to concat string 
        System.out.println("Concat string = "+fname.concat(lname));
    }
}
