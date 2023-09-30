package Fabrica;

import Interfaces.iGameItem;

public abstract class ItemGenerator {
    public abstract iGameItem createItem();
    public void openRevard(){
        createItem().open();
    }
}
