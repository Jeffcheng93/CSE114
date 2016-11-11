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
public class CookiePack extends Dessert{
    private int cookieNumbers; // 商标
    private int cookiePrice;  // 性价比
    
    
    public CookiePack(String name, int number, int price){
        super(name);
        this.cookieNumbers = number;
        this.cookiePrice = price;    
    }
    
    @Override
    public int getCost(){
        return  this.cookieNumbers * this.cookiePrice;
    }
    
    @Override
    public String getName(){
        return  super.getName();
    }
    
    public String toString(){   
        return "CookiePack type is: " + getName() + ". and total price is: " + getCost();
    }
      
    
}
