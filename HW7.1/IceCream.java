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
public class IceCream extends Dessert{
       
  public IceCream(String name , int cost){
      super(name, cost);
  }
  
  public IceCream(String name , int cost, String a, int b){
      super(name, cost);
  }
  
  @Override
  public String getName(){
      return super.getName();
  }
  
  @Override
  public int getCost(){
      return super.getCost();
  }
  
  @Override
  public String toString(){
      return "The name of icecream is: " + super.getName()+ ". and price is: "
              + super.getCost();
  }
 
}
