
package person;

/**
 *Name: Maaz Khan
 * REG.No: SP23-BSE-109
 * @author Nitro 5
 */
public class Person {
   protected String name;
   protected String address;
   protected String phoneNumber;
   protected String emailAddress;
   public Person(){
       
   }
   public Person(String name, String address, String phoneNumber, String emailAddress){
       this.name = name;
       this.address = address;
       this.emailAddress = emailAddress;
       this.phoneNumber = phoneNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phone){
        this.phoneNumber = phone;
    }
    public void setEmail(String email){
        this.emailAddress = email;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNum(){
        return phoneNumber;
   }
    public String getEmail(){
        return emailAddress;
    }
    public void show(){
        System.out.printf("Name: %s\nAddress: %s\nPhone number: %s\nEmail Address: %s\n",name,address,phoneNumber,emailAddress);
    }
}
class Student extends Person{
    protected String status;
    public Student(){
        
    }
    public Student(String name, String address, String phoneNumber, String emailAddress, String status){
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
    public void show(){
        System.out.printf("Name: %s\nAddress: %s\nPhone NUmber: %s\nEmail: %s\nStudent Status: %s\n",name,address,phoneNumber,
                emailAddress,status);
    }
}
class Employee extends Person{
    protected String office;
    protected double salary;
    protected Date dateHired;
    public Employee(){
        
    }
    public Employee(String name, String address, String phoneNumber, String emailAddress,String office, double salary, Date dateHired){
        super(name,address,phoneNumber,emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    public void setOffice(String office){
        this.office = office;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setDate(Date date){
        this.dateHired = date;
    }
    public String getoffice(){
        return office;
    }
    public double getSalary(){
        return salary;
    }
    public Date getDateHired(){
        return dateHired;
    }
    public void show(){
        super.show();
        System.out.printf("Office: %s\nSalary: %f\nDate of Hired %s",office,salary,dateHired.date());
    }
    
}
class Faculty extends Employee{
    protected int officeHour;
    protected String rank;
    public Faculty(String name, String address, String phoneNumber, String emailAddress,String office, double salary, Date dateHired,
        int officeHour, String rank){
        super(name,address,phoneNumber,emailAddress,office,salary,dateHired);
        this.officeHour = officeHour;
        this.rank = rank;
    }
    public Faculty(){
        
    }
    public void show(){
        super.show();
        System.out.printf("office Hour %d\nrank %s",officeHour,rank);
    }
}
class Staff extends Employee{
    protected String title;
    public Staff(String name, String address, String phoneNumber, String emailAddress,
            String office, double salary, Date dateHired,String title){
        super(name,address,phoneNumber,emailAddress,office,salary,dateHired);
        this.title = title;
        
    }
    public Staff(){
        
    }
     public void show(){
        super.show();
        System.out.printf("\nTitle %s",title);
    }
    
}
