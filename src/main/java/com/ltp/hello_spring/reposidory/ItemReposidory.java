package com.ltp.hello_spring.reposidory;


import com.ltp.hello_spring.Item;
import java.util.*;

public class ItemReposidory {
    private List<Item> items = new ArrayList<Item>();

    public List<Item> getItems() {
        return this.items;
    }

    public Item getItem(int index) {
        return items.get(index);
    }

    public void addItem(Item item) {
            items.add(item);
       
    }
    public void updateItem(int index, Item item){
        items.set(index, item);
    }

   
    

}
