package com.lambdaschool;

public class Main {
    public static void main(String[] args) {
        initializeApp();
    }

    public static void initializeApp() {
        CreateStack newStack = new CreateStack();
        newStack.numOfItems();

        newStack.push("first");
        newStack.push("second");
        newStack.push("third");

        System.out.println(newStack.numOfItems());

        newStack.print();
        System.out.println(newStack.pop());

        newStack.print();
        System.out.println(newStack.pop());

        newStack.print();
        System.out.println(newStack.pop());

        newStack.print();

        System.out.println(newStack.numOfItems());
    }
}
