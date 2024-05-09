
package person;


public class Main {
    public static void main(String args[]){
        System.out.println("Name: MAAZ KHAN\n REG.NO: SP23-BSE-109\n\n");
        
        Person p = new Person("Maaz Khan","Province KPK/District Dir/Village Rabat","0348-8102104","songhop757@gmail.com");
        p.show();
        System.out.println("\n________________\n    Student\n___________________");
        Student st = new Student("Sudais","Province KPK/District Dir/Village Rabat","0348-8102104","songhop757@gmail.com","Good");
        st.show();
        System.out.println("\n_________________\n   EMPLOYEE\n__________________");
        Date d = new Date(30,4,2024);
        Employee em = new Employee("Sudias","Province KPK/District Dir/Village Rabat","0348-8102104","songhop757@gmail.com","Z block 101",230000.0,d);
        em.show();
        System.out.println("\n_________________\n   FACULTY\n____________________");
        Faculty f = new Faculty("Fawad Khan","Province KPK/District Dir/Village batKhelet","0348-8102104","songhop757@gmail.com","Z block 101",230000.0,d,8,"1st");
        f.show();
        System.out.println("\n_________________\n    STAFF\n______________________");
        Staff s = new Staff("Sudais","Province KPK/District Dir/Village Rabat","0348-8102104","songhop757@gmail.com","Z block 101",230000.0,d,"Software Engineer");
        s.show();
        
        System.out.println("\n\n__________________________________________\n NEXT PROJECT\n\n____________________________________");
        Publication pl = new Publication("OPPS",150.0);
        pl.price = 500.0;
        pl.showInfo();
        Book bk = new Book("OPPS",20.0,500);
        bk.title = "OPPS";
        bk.showInfo();
        Tape tp = new Tape("OPPS",4000.0,120);
        tp.playTime = 500;
        tp.showInfo();
    }
    
}
