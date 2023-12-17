import java.util.ArrayList;
import java.util.List;

import domain.Bottle;
import domain.HotDrink;
import domain.product;
import service.CoinDispenser;
import service.Display;
import service.Holder;
import service.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
      //  System.out.println("Hello, World!");
      product item1 = new product("lays", 0, 100, "snack");
     // System.out.println(item1);
      product item2 = new product("twix", 1, 200, "chocolate");
      product item3 = new product("nuts", 2, 300, "nuts");
      product item4 = new Bottle("Cola", 3, 400, "drinks", 0.5);
      product item5 = new HotDrink("Latte", 4, 500, "Coffee", 70);
      product item6 = new HotDrink("GreenTea", 5, 450, "Tea", 85);



      List <product> assort = new ArrayList<>();
      assort.add(item1);
      assort.add(item2);
      assort.add(item3);
      assort.add(item4);
      assort.add(item5);
      assort.add(item6);



      Holder hold1 = new Holder();
      CoinDispenser cd1 = new CoinDispenser();
      Display disp1 = new Display();

      VendingMachine mach1 = new VendingMachine(hold1, cd1, disp1, assort);
      for (product prod: mach1.getProducts()) {
        System.out.println (prod);
      }      
    }
}
