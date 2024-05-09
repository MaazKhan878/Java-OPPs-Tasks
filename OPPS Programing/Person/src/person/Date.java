
package person;

/**
 *
 * @author Nitro 5
 */
public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year){
        if(day>=1 && day<=31){
            this.day = day;
        }
        else{
            throw new IllegalArgumentException("Enter the days under the range 1 to 31");
        }
        if(month>=1 && month<=12){
            this.month = month;
        }
        else{
             throw new IllegalArgumentException("Enter the days under the range 1 to 31");
        }
            
        this.year = year;
    }
    public void setDay(int day){
        if(day>=1 && day<=31){
            this.day = day;
        }
        else{
            throw new IllegalArgumentException("Enter the days under the range 1 to 31");
        }
    }
    public void setMonth(int month){
         if(month>=1 && month<=12){
            this.month = month;
        }
        else{
             throw new IllegalArgumentException("Enter the days under the range 1 to 31");
        }
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    
    public String date(){
        return (day+"/"+month+"/"+year);
    }
}
