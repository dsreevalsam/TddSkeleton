package com.oocode;

public class RecentlyUsedList {
    private Boolean hasItem =false;
    public Boolean isEmpty() {
        return !hasItem;
    }

    public void addItem(String item) {
        hasItem =true;
    }
}
