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
        Triangles t = new Triangles();
        int a,b,c;
        
                System.out.println("Enter a:");
                a=scanner.nextInt();
                
                System.out.println("Enter b:");
                b=scanner.nextInt();
                
                System.out.println("Enter c:");
                c=(scanner.nextInt());  
                
                if(t.positiveValues(a, b, c) ){
                System.out.println("Triangle is " + t.triangleType(a,b,c));
                }else{
                    System.out.println("Invalid triangle");
                }
                
    }
    
    
    public boolean positiveValues(int a, int b, int c){
        if(a>0&&b>0&&c>0){
            return true;
        }else{
            return false;
        }
    }

    public String triangleType(int a, int b, int c){
        if(a==b&&b==c&&c==a){
            return "equilateral";
        }
        if(a==b||b==c||c==a){
        return "isosceles";
        }
        else return "scalene";
            
    }
    
}
