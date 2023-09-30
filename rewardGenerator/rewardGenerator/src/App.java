import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Fabrica.ClothingGen;
import Fabrica.DiamondGen;
import Fabrica.GarbageGen;
import Fabrica.GemGenerator;
import Fabrica.GoldGenerator;
import Fabrica.ItemGenerator;
import Fabrica.MoneyGen;
import Fabrica.SilverGenerator;
import Fabrica.WoodGen;
import Product.Garbage;

public class App {
   public static void main(String[] args) throws Exception {
      // ItemGenerator factoryGold = new GoldGenerator();
      // factoryGold.openRevard();
      List<ItemGenerator> listItemGenerator = new ArrayList<>();

      for (int i = 0; i < 20; i++) {
         listItemGenerator.add(new SilverGenerator());
      }
      for (int i = 0; i < 10; i++) {
         listItemGenerator.add(new GoldGenerator());
      }
      for (int i = 0; i < 7; i++) {
         listItemGenerator.add(new GemGenerator());
      }
      for (int i = 0; i < 3; i++) {
         listItemGenerator.add(new DiamondGen());
      }
      for (int i = 0; i < 10; i++) {
         listItemGenerator.add(new GarbageGen());
      }
      for (int i = 0; i < 20; i++) {
         listItemGenerator.add(new WoodGen());
      }
      for (int i = 0; i < 20; i++) {
         listItemGenerator.add(new ClothingGen());
      }
      for (int i = 0; i < 10; i++) {
         listItemGenerator.add(new MoneyGen());
      }

      Random random = new Random();
      for (int i = 0; i < 10; i++) {
         int index = random.nextInt(100);
         listItemGenerator.get(index).openRevard();
      }

   }
}
