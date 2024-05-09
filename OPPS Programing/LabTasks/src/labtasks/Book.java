
package labtasks;

// Name Maaz Khan
public class Book{
    private Person p;
    private String bookName;
    private String publisher;
    Book(){
        p = new Person();
        bookName = null;
        publisher = null;
    }
    Book(String bookName, String publisherm, Person p){
        this.bookName = bookName;
        this.publisher = publisher;
        this.p = p;
    }
    public void setPerson(Person p){
        this.p = p;
    }
    public void setBookName(String bookName){
        this.bookName = bookName;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public Person getPerson(){
        return p;
    }
    public String getBookName(){
        return bookName;
    }
    public String getPublisher(){
        return publisher;
    }
    public void show(){
        p.show();
        System.out.println("BoookName: "+bookName+"\nPublisher Name: "+publisher);
    }
}
class Runner{
    public static void main(String args[]){
        Address a = new Address("Khizar","K House","Peshawar","101B12");
        Person p = new Person("Khizar Khan","102e",a);
        Book b = new Book("Englisg","JangizKhan",p);
        b.setBookName("FP");
        b.show();
        
    }
}

