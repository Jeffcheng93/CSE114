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
public abstract class Dessert {
    private String name;
    private int cost;
    
    public Dessert(int layer){
  
    }
    
    public Dessert(String name , int cost, String a, int b){
      
    }
    
    public Dessert(String nameAlias){
        this.name = nameAlias;
       // this.cost = 0;
        
    }
    
    Dessert(String nameAlias, int costAlias){
        this.name = nameAlias;
        this.cost = costAlias;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getCost()
    {
        return this.cost;
    }
}
