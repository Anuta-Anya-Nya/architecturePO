package Fabrica;

import Interfaces.iGameItem;
import Product.Money;

public class MoneyGen extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Money();
    }

}
