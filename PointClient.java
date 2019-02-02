/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrahman
 */
public class PointClient {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 30);
        
        p2 = null; 
        
        System.out.println(p1.getClass().toString());
        
        System.out.println(p1);
        System.out.println(p2);
        String s = "sjkldfhs";
        if(p1.equals(s) == true)
            System.out.println("True");
        else
            System.out.println("False");
        
        
        //p1.equals(p1);
        
        
        
        //p1.setX(10);
        //System.out.println(p1.toString());
        
        
    }
    
}
