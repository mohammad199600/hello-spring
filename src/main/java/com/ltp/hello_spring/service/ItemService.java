package com.ltp.hello_spring.service;

import com.ltp.hello_spring.Constants;
import com.ltp.hello_spring.Item;
import com.ltp.hello_spring.reposidory.ItemReposidory;
import java.util.*;
import java.util.concurrent.*;

public class ItemService {
    ItemReposidory itemReposidory = new ItemReposidory();

    public List<Item> getItems() {
        return itemReposidory.getItems();
    }

    public Item getItem(int index) {
        return itemReposidory.getItem(index);
    }

    public void addItem(Item item) {
        itemReposidory.addItem(item);

    }

    public void updateItem(int index, Item item) {
        itemReposidory.updateItem(index, item);
    }

    public Integer getIndex(String id) {
        for (int i = 0; i < itemReposidory.getItems().size(); i++) {
            if (itemReposidory.getItem(i).getId().equals(id))
                return i;
        }
        return Constants.NOT_FOUND;
    }

    public boolean within5Days(Date newDate, Date oldDate) {
        long diff = Math.abs(newDate.getTime() - oldDate.getTime());
        return (int) (TimeUnit.MILLISECONDS.toDays(diff)) <= 5;

    }

    public Item getItem(String id) {
        int index = getIndex(id);
        return index == Constants.NOT_FOUND ? new Item() : getItem(index);
    }

    public String submitItem(Item item) {
        int index = getIndex(item.getId());
        String status = Constants.SUCCESS_STATUS;
        if (index == Constants.NOT_FOUND) {
            addItem(item);
        } else if (within5Days(item.getDate(), getItem(index).getDate())) {
            updateItem(index, item);
        } else {
            status = Constants.FAILED_STATUS;
        }
        return status;
    }
}
