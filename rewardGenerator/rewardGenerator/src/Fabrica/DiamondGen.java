package Fabrica;

import Interfaces.iGameItem;
import Product.Diamond;

public class DiamondGen extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Diamond();
    }
    
}
