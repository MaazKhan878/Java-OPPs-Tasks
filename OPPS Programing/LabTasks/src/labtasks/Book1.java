/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtasks;

/**
 *
 * @author Nitro 5
 */
public class Book1 {
    private String author;
    private String bookName[];
    Book1(){
        author = null;
        bookName = new String[100];
    }
    Book1(String author, String bookName[]){
        this.author = author;
        this.bookName = bookName;
    }
    public void setAuther(String author){
        this.author = author;
    }
    public void setBookName(String bookName[]){
        this.bookName = bookName;
    }
    public String getAuthor(){
        return author;
    }
    public String[] getBookName(){
        return bookName;
    }
    public boolean CompareBook(Book1 b1 , Book1 b2){
        return b1.getAuthor().equals(b2.getAuthor());
    }
    public String[] compareChapter(Book1 b1, Book1 b2){
        if(b1.getBookName().length> b2.getBookName().length){
            return b1.getBookName();
        }
        else{
            return b2.getBookName();
        }
    }
    
    
}
class RunnerBook{
    public static void main(String args[]){
        Book1 b1 = new Book1();
        b1.setAuther("Maaz Khan");
        b1.setBookName(new String[]{"Encapsulation","Polymorphism","Inheratance","Class","Abstract class"});
        Book1 b2 = new Book1("Fawad Khan",new String[]{"Polymorphism","Inheritance","Interface"});
        Book1 b3 = new Book1();
        System.out.println("Book 1 and Book Arthur are Same "+b3.CompareBook(b1, b2));
        for(String chapterName: b3.compareChapter(b1, b2)){
            System.out.print(chapterName+" ");
        }
    }
}
