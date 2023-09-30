package Fabrica;

import Interfaces.iGameItem;
import Product.Clothing;

public class ClothingGen extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new  Clothing();
    }
    
}
