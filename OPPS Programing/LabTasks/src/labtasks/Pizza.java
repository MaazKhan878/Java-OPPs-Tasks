/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtasks;

/**
 *
 * @author Nitro 5
 */
public class Pizza {
    private String pizaSize;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
    public Pizza(){
        
    }
    public Pizza(String size, int cheesTop, int peppTop, int hamTop){
        pizaSize = size;
        cheeseToppings = cheesTop;
        pepperoniToppings = peppTop;
        hamToppings = hamTop;
        
    }
    public void setPizaSize(String size){
        pizaSize = size;
    }
    public void setPizaCheesTop(int pc){
        cheeseToppings = pc;
    }
    public void setPeppTop(int ppep){
        pepperoniToppings = ppep;
    }
    public void setHamTopp(int ham){
        hamToppings = ham;
    }
    public String getSize(){
        return pizaSize;
    }
    public int getCheeseTop(){
        return cheeseToppings;
    }
    public int getPepp(){
        return pepperoniToppings;
    }
    public int getHam(){
        return hamToppings;
    }
    public double calCost(){
        double cost = 0.0;
        if(pizaSize.equals("Small")){
            cost = 10 + 2 * (cheeseToppings + pepperoniToppings + hamToppings);
        }
        else if(pizaSize.equals("Medium")){
            cost = 12 + 2 * (cheeseToppings + pepperoniToppings + hamToppings);
        }
        else if(pizaSize.equals("Large")){
             cost = 14 + 2 * (cheeseToppings + pepperoniToppings + hamToppings);
        }
        return cost;
        
    }

    
}
class PizaRunner{
    public static void main(String args[]){
        Pizza p = new Pizza("Small",4,5,6);
        System.out.println(p.calCost());
        p.setPizaSize("Large");
        p.setHamTopp(10);
        System.out.println(p.calCost());
    }
}
