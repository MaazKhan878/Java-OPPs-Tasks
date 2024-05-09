
package labtasks;
// Name Maaz Khan

public class Address {
    private String street;
    private String house;
    private String city;
    private String code;
    Address(){
        street = null;
        house = null;
        city = null;
        code = null;
    }
    Address(String street, String house, String city, String code){
        this.street = street;
        this.house = house;
        this.city = city;
        this.code = code;
    }
    public void setStreet(String Street){
        this.street = Street;
    }
    public void setHouse(String house){
        this.house = house;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getStreet(){
    return street;
    }
    public String getcity(){
        return city;
    }
    public String getHouse(){
        return house;
    }
    public String getCode(){
        return code;
    }
    public void show(){
        System.out.println("City: "+city+"\nStreet: "+street+"\nHouse: "+house+"\nCode: "+code);
    }
    
}
class Person{
    private String name;
    private String id;
    private Address address;
    Person(){
        name = null;
        id = null;
        address = new Address();
    }
    Person(String name, String id, Address address){
        this.name = name;
        this.id = id;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public Address getAddress(){
        return address;
    }
    public void show(){
        System.out.println("Name: "+name+"\nID: "+id);
        address.show();
    }
   
}
class Test{
    public static void main(String args[]){
        Address a = new Address("Khizar","K House","KPK","10123B");
        Person p = new Person("Khizar Khan","1019e",a);
        p.show();
        a.setCity("106b");
        a.setHouse("ADR");
        a.setStreet("WErt");
        a.setCity("KPK");
        p.setAddress(a);
        p.show();
    }
}