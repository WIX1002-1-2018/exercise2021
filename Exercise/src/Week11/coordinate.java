/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;

/**
 *
 * @author pensyarah
 */
public class coordinate {
    
    private int x, y;

    public coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public coordinate() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void output(){
        System.out.println("The coordinate is " + this.x + " and " + this.y);
    }
            
    
    
    
}
