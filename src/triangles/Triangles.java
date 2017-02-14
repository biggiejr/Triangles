package triangles;

import java.util.Scanner;

/**
 *
 * @author Mato
 */
public class Triangles {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker w = new Worker();
        int a,b,c;
        try{
                System.out.println("Enter a:");
                a=scanner.nextInt();
                
                System.out.println("Enter b:");
                b=scanner.nextInt();
                
                System.out.println("Enter c:");
                c=(scanner.nextInt());  
        
                if(w.positiveValues(a, b, c) && w.isTriangle(a, b, c)){
                System.out.println("Triangle is " + w.triangleType(a,b,c));
                }else{
                    System.out.println("Invalid triangle");
                }
               }catch(Exception e){
            System.out.println("Invalid value");
        } 
    }
}
    
    