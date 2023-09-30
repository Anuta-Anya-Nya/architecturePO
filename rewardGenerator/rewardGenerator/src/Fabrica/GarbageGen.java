package Fabrica;

import Interfaces.iGameItem;
import Product.Garbage;

public class GarbageGen extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Garbage();
    }
    
}
