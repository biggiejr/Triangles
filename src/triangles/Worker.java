/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangles;

/**
 *
 * @author Mato
 */
public class Worker {
    
    public boolean isTriangle(int a,int b,int c){
        return a+b>c&&b+c>a&&c+a>b;
        
    }
    
    public boolean positiveValues(int a, int b, int c){
        return a>0&&b>0&&c>0;
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

    

