/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtasks;

/**
 *
 * @author Nitro 5
 */
public class Sample {
    protected int num1;
    protected int num2;

    //
    public Sample(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    public void add() {
        System.out.println("Sum: " + (num1 + num2));
    }

    public void sub() {
        System.out.println("Difference: " + (num1 - num2));
    }

   
    public void mul() {
        System.out.println("Product: " + (num1 * num2));
    }
    public void div() {
        if (num2 != 0) {
            System.out.println("Quotient: " + (num1 / num2));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

class VerifiedSimple extends Sample {
 
    public VerifiedSimple(int num1, int num2) {
        super(num1, num2);
    }
    @Override
    public void add() {
        if (num1 > 0 && num2 > 0) {
            super.add();
        } else {
            System.out.println("Error: Numbers must be greater than 0.");
        }
    }

    @Override
    public void sub() {
        if (num1 > 0 && num2 > 0) {
            super.sub();
        } else {
            System.out.println("Error: Numbers must be greater than 0.");
        }
    }

    @Override
    public void mul() {
        if (num1 > 0 && num2 > 0) {
            super.mul();
        } else {
            System.out.println("Error: Numbers must be greater than 0.");
        }
    }

    @Override
    public void div() {
        if (num1 > 0 && num2 > 0) {
            super.div();
        } else {
            System.out.println("Error: Numbers must be greater than 0.");
        }
    }
}

class SimpleRunner{
    public static void main(String[] args) {
        VerifiedSimple obj = new VerifiedSimple(101, 15);
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
        VerifiedSimple invalidObj = new VerifiedSimple(-10, 9);
        invalidObj.add();
        invalidObj.sub();
        invalidObj.mul();
        invalidObj.div();
    }
}
