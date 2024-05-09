
package result;

/**
 *
 * @author Nitro 5
 */
class ResultPro{
    private String name;
    private String regNo;
    private double marks[];
    ResultPro(String name, String regNo,int size){
        this.name = name;
        this.regNo = regNo;
        this.marks = new double[size];
    }
    public void setName(String name){
        this.name = name;
    }
    public void regNo(String regNo){
        this.regNo = regNo;
    }
    public void setMarks(double []marks){
        for(int i = 0; i<marks.length; i++){
            this.marks[i] = marks[i];
        }
    }
    public String getName(){
        return this.name;
    }
    public String getRegNo(){
        return this.regNo;
    }
    public double getMarks(int i){
        return marks[i];
    }
        
}
public class Result {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ResultPro rp = new ResultPro("Maaz Khan","SP23-BSE-109",6);
       double marks[] = {100.0,500.0,23.0,123.0,150};
       rp.setMarks(marks);
       System.out.println("Name: "+rp.getName());
       System.out.println("ID: "+rp.getRegNo());
       for(int i = 0; i<marks.length; i++){
           System.out.println("Marks: "+rp.getMarks(i));
       }
        // TODO code application logic here
    }
    
}
