package HW7;

import java.util.ArrayList;

public class DessertCafe {
    
    
    public static boolean equalTest(Dessert a, Dessert b){
        if(a.getClass() == b.getClass())
        {
            if(a.getName() == b.getName())
            {
                if(a.getCost() == b.getCost())
                {
                    return true;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    
    } 
 
    public static void main(String[] args) {
        ArrayList<Dessert> desserts = new ArrayList<>();
        
        
        
        CookiePack objTest = new CookiePack("BigCookie", 5, 2);
        Sundae obj2Test = new Sundae("watermellon", 2, "topApple", 5);
        IceCream obj3Test = new IceCream("watermellon", 2);
        Cake obj4Test = new Cake("Sweet", 3);
        
        CookiePack obj5Test = new CookiePack("smallCookie", 3, 3);
        Sundae obj6Test = new Sundae("watermellon", 3, "topOrange", 3);
        IceCream obj7Test = new IceCream("lemon", 5);
        Cake obj8Test = new Cake("honey", 7);
        
//        System.out.println(objTest.toString());
//        System.out.println(obj2Test.toString());
//        System.out.println(obj3Test.toString());
//        System.out.println(obj4Test.toString());
        
        desserts.add(objTest);
        desserts.add(obj2Test);
        desserts.add(obj3Test);
        desserts.add(obj4Test);
        desserts.add(obj5Test);
        desserts.add(obj6Test);
        desserts.add(obj7Test);
        desserts.add(obj8Test);
        
        for(Dessert i : desserts)
        {
            System.out.println(i.toString() + "\n");
        }
       
        if(equalTest(objTest, obj2Test))
        {
            System.out.println("The two items are exactly the same");
        }
        else
            System.out.println("The two items are different");
        
        
        if(equalTest(objTest, obj2Test))
        {
            System.out.println("The two items are exactly the same");
        }
        else
            System.out.println("The two items are different");
        
        if(equalTest(objTest, objTest))
        {
            System.out.println("The two items are exactly the same");
        }
        else
            System.out.println("The two items are different");
        
        

        
    }
    
}
