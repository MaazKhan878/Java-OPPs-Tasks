
package person;

/**
 *
 * @author Nitro 5
 */
public class Publication {
    protected String title;
    protected double price;
    public Publication(){
        
    }
    public Publication(String title, double price){
        this.title = title;
        this.price = price;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public void showInfo(){
        System.out.println("___________\n    PUBLICATION\n__________\nTitle: "+title+"\nPrice: "+price);
    }
}
class Book extends Publication{
    protected int pageCount;
    public Book(){
        
    }
    public Book(String title,double price,int pageCount){
        super(title,price);
        this.pageCount = pageCount;
    }
    public void setPageCount(int pageCount){
        this.pageCount = pageCount;
    }
    public int getPageCount(){
        return pageCount;
    }
    public void showInfo(){
        System.out.printf("__________\n    BOOK\n____________\nTitle: %s\nPrice: %f\nPage Count: %d\n",title,price,pageCount);
    }
}
class Tape extends Publication{
    protected int playTime;
    public Tape(){
        
    }
    public Tape(String title, double price, int time){
        super(title,price);
        this.playTime = time;
    }
    public void setPlayTime(int playTime){
        this.playTime = playTime;
    }
    public int getPLayTime(){
        return playTime;
    }
    public void showInfo(){
        System.out.printf("___________\n TAPE\n___________\nTitle: %s\nPrice: %f\nPlay Time: %d\n",title,price,playTime);
    }
}
