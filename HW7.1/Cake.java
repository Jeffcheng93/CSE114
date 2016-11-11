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
public class Cake extends Dessert{
    
    private int layers;

    public Cake(String nameAlias,  int layerAlias) {
        super(nameAlias);
        this.layers = layerAlias;     
    }
    
    @Override
    public int getCost(){
        return 15+2*this.layers;
    }
    
    @Override
    public String getName(){
        return  super.getName();
    }
    
     public String toString(){   
        return "Cake type is: " + getName() + ".  and total price is: " + getCost();
        
    }
 
    
    
    
    
}
