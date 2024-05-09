
// Name Maaz Khan
// SP23-BSE-109
package labtasks;

public class Movie {
    private String rating;
    private int idNumber;
    private String title;
    
    public Movie(String rating, int idNumber, String title) {
        this.rating = rating;
        this.idNumber = idNumber;
        this.title = title;
    }

    
    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

     
      @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Movie))
            return false;
        Movie other = (Movie) obj;
        return idNumber == other.idNumber;
    }
    
    public double calcLateFees(int daysLate) {
        return daysLate * 2.5; // Late fee for comedy movies
    }
}

class Action extends Movie {
   
    public Action(String rating, int idNumber, String title) {
        super(rating, idNumber, title);
    }    
    public double calcLateFees(int daysLate) {
        return daysLate * 3;
    }
}
class Comedy extends Movie {
    
    public Comedy(String rating, int idNumber, String title) {
        super(rating, idNumber, title);
    }

    
     @Override
    public double calcLateFees(int daysLate) {
        return daysLate * 2.5; 
    }
}

class Drama extends Movie {
    public Drama(String rating, int idNumber, String title) {
        super(rating, idNumber, title);
    }
}

class Main {
    public static void main(String[] args) {
        
        Movie movie1 = new Action("Underrated", 101, "Iron man 3");
        Movie movie2 = new Comedy("R", 102, "Thor");
        Movie movie3 = new Drama("R", 103, "Infinte war");
        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
        System.out.println("movie1 equals movie2: " + movie1.equals(movie2)); 
        System.out.println("movie1 equals movie1: " + movie1.equals(movie1)); 
        System.out.println("Late fee for movie1 (2 days late): $" + movie1.calcLateFees(2));
        System.out.println("Late fee for movie2 (3 days late): $" + movie2.calcLateFees(3));
        System.out.println("Late fee for movie3 (4 days late): $" + movie3.calcLateFees(4));
    }
}
