
package practices;

/**
 *
 * @author Nitro 5
 */
public class Practices {
    private String name;
    private String ID;
    private double totalMarks;
    Practices(String name, String Id, double Marks){
        this.name = name;
        this.ID = Id;
        this.totalMarks = Marks;
    }
    public void show(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        System.out.println("Total Marks: "+totalMarks);
    }
}


