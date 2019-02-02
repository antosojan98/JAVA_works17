/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 * This is a Point class. Describe your class. 
 * @author mrahman
 */
public class Point {

    // ivars
    private int x, y;

    /**
     * This is the default constructor for Point class. Creates a (0, 0) point.
     */
    public Point() {
        //setX(0);
        //setY(0);
        this(0, 0);

    }

    /**
     * Constructor for Point. 
     * @param xVal positive value for x coordinate of Point.
     * @param yVal positive value for y coordinate of Point.
     */
    public Point(int xVal, int yVal) {
        setX(xVal);
        setY(yVal);

    }

    /**
     * Mutator method for x value.
     * @param xval positive value for x coordinate of Point.
     */
    public void setX(int xval) {
        if (xval >= 0) {
            x = xval;
        }
    }

    /**
     * Mutator method for y value.
     * @param yval positive value for y coordinate of Point.
     */
    public void setY(int yval) {
        y = Math.abs(yval);    
    }

    // Accessor Methods
    /**
     * Getter method for x coordinate of Point.
     * @return current value of x.
     */
    public int getX() {
        return x;
    }

    /**
     * Getter method for y coordinate of Point.
     * @return current value of y.
     */
    
    public int getY() {
        return y;
    }

    /**
     * String representation of Point.
     * @return string representation of the states of Point object.
     */
    @Override
    public String toString() {
        String s = "x = " + x + " y = " + y;
        return s;
    }
    
    /**
     * Compares two Point objects.
     * @param obj reference to another Point object.
     * @return True if two points are the same; False otherwise.  
     */

    @Override
    public boolean equals(Object obj) {
        // null check
        if (obj == null) {
            return false;
        }
        // check for itself
        if (this == obj) {
            return true;
        }
        // check for similar Objcet (Point)
        if (obj instanceof Point) {
            Point other = (Point) obj;

            // actual state comparison
            if (x == other.getX() && y == other.getY()) {
                return true;
            }
        }
        return false;
    }
}
