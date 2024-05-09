
package labtasks;

/**
 *
 * @author Nitro 5
 */
public class Point {
    private double xCord;
    private double yCord;
    public Point(){
        xCord = 0.0;
        yCord = 0.0;
    }
    public Point(double xCord, double yCord){
        this.xCord = xCord;
        this.yCord = yCord;
    }
    public void setXcord(double xCord){
        this.xCord = xCord;
    }
    public void setyCord(double yCord){
        this.yCord = yCord;
    }
    public double getXcord(){
        return xCord;
    }
    public double getYcord(){
        return yCord;
    }
    public void display(){
        System.out.println("XCord: "+xCord+"\nyCord "+yCord);
    }
    
}
class Linel{
    Point startPoint;
    Point endPoint;
    Linel(){
        startPoint = new Point();
        endPoint = new Point();
    }
    Linel(Point startPoint, Point endPoint){
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
    public double length(){
        double x1 = startPoint.getXcord();
        double x2 = endPoint.getXcord();
        double y1 = startPoint.getYcord();
        double y2 = endPoint.getYcord();
        return Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2); 
    }
    
}
class PointRunner{
    public static void main(String args[]){
        Point p1 = new Point(23.0,45.0);
        Point p2 = new Point(66.0,76.0);
        Linel l = new Linel(p1,p2);
        System.out.println(l.length());
    }
    
}
