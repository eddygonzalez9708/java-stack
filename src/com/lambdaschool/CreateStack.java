package com.lambdaschool;

import java.util.ArrayList;
import java.util.Stack;

public class CreateStack {
    private ArrayList<String> items = new ArrayList<String>(1000);

    public void push(String item) {
        items.add(item);
    }

    public String pop() {
        int index = items.size() - 1;
        String poppedItem = items.get(index);
        items.remove(index);
        return "The string " + poppedItem + " was popped from the stack.";
    }

    public void print() {
        String list = "";

        for (int i = 0; i < items.size(); i++) {
            if (i == items.size() - 1) {
                list = list.concat(items.get(i));
            } else {
                list = list.concat(items.get(i) + ", ");
            }
        }

        System.out.println("[" + list + "]");
    }

    public String numOfItems() {
        if (items.size() > 0) {
            return Integer.toString(items.size());
        } else {
            return "There are no items in your Stack.";
        }
    }
}
