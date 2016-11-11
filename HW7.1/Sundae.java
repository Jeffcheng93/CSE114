/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW7;

/**
 *
 * @author chengp
 */
public class Sundae extends IceCream{
    private String SundaeName;
    private int topCost;
    
    
    public Sundae(String iceName, int icePrice, String SundaeName2, int topCost2) 
    {
      super(iceName, icePrice);
      this.SundaeName = SundaeName2;
      this.topCost = topCost2;  
    }
    
    public String getName(){
      return this.SundaeName;
    }
  
    public int getCost(){
      return super.getCost() + this.topCost;
    }
    
    public String toString(){   
        return "Sundae type is: " + getName() + ". and total price is: " + getCost();
        
    }
    
    
    
}
