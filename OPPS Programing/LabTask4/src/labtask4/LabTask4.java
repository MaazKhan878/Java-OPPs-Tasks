/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labtask4;

/**
 *
 * Name Bilal Ali Malik
 * REg NO: SP23-BSE-131
 */
//Q1 ANSWER
class Distance{
    private double feet;
    private double inch;
    Distance(){
        feet = 0.0;
        inch = 0.0;
    }    
    Distance(double feet, double inch){
         this.feet = feet;
         this.inch = inch;
    }
    public void setFeet(double feet){
        this.feet = feet;
    }
    public void setInch(double inch){
        this.inch = inch;
    }
    public double getFeet(){
        return this.feet;
    }
    public double getInch(){
        return this.inch;
    }
    public Distance addObject(Distance a, Distance d){
       Distance x = new Distance(a.feet+d.feet,d.inch+a.inch);
       return x;
    }
    public void display(){
        System.out.println("Feet = "+feet+" and Inch = "+inch);
    }
}
// Q2 ANSWER
class Fraction{
    private int x;
    private int y;
    Fraction(){
        x = 0;
        y = 0;
    }
    Fraction(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setx(int x){
        this.x = x;
    }
    public void sety(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void display(){
        System.out.println(x+"/"+y);
    }
    public Boolean equals(Fraction f){
        return x == f.x && y == f.y;
    }
}
public class LabTask4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Distance d1 = new Distance(23.0,6.0);
        Distance d2 = new Distance(2.0,28.0);
        Distance d3 = d2.addObject(d1, d2);
        d3.display();
        
        Fraction f1 = new Fraction(4,2);
        Fraction f2 = new Fraction(4,2);
        Fraction f3 = new Fraction(3,5);
        System.out.println("Fraction 1 == Fraction2 its "+f2.equals(f1));
        System.out.println("Fraction 1 == Fraction3 its "+f1.equals(f3));
        f1.display();
        f2.display();
        f3.display();
        
    }
    
}
