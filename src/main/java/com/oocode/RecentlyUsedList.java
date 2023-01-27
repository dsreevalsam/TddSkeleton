package com.oocode;

public class RecentlyUsedList {
    private String item = null;
    public Boolean isEmpty() {
        return item == null;
    }

    public void addItem(String item) {
        this.item = item;
    }

    public String retrieveItem() {
        return item;
    }
}
