package Fabrica;

import Interfaces.iGameItem;
import Product.Wood;

public class WoodGen extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Wood();
    }
    
}
