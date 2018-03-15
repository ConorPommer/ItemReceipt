/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labreceipt;

/**
 *
 * @author 19288
 */
public class Items {
    private String name;
    
    private double price;
    
    public Items(String pname,  double cost){
        name = pname;
       
        price = cost;
    }
    public void setItem(String pname, double cost){
        name = pname;
        
        price = cost;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    @Override
    public String toString(){
        return "The item you chose is "+name+" and it has a cost of $"+price;
    }
            
}
