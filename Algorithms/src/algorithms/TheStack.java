/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Arrays;

/**
 *
 * @author javaday
 */
public class TheStack {

    private String[] stackArray;

    private int stackSize;

    private int topOfStack = -1;

    TheStack(int size) {
        stackSize = size;
        stackArray = new String[size];
        Arrays.fill(stackArray, "-1");

    }

    public void push(String input) {
        if (topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
            System.out.println("PUSH " + input + " Was Added to the Stack");
            displayTheStack();
        } else {
            System.out.println("Sorry But Stack is Full");
            displayTheStack();
        }
    }

    public String pop() {
        if (topOfStack >= 0) {
            displayTheStack();
            System.out.println("POP " + stackArray[topOfStack] + " Was Removed From the Stack\n");

            stackArray[topOfStack] = "-1";

            return stackArray[topOfStack--];
        } else {
            displayTheStack();
            System.out.println("Sorry But the Stack is Empty");
            return "-1";
        }
    }

    public String peek() {
        displayTheStack();
        System.out.println("PEEK " + stackArray[topOfStack] + " Is at the top of the Stack\n");
        return stackArray[topOfStack];

    }

    public void displayTheStack() {
        printLineDecorator();
        for (int i = 0; i < stackSize; i++) {
            System.out.print(i + "  | ");
        }

        printLineDecorator();
        for (int j = 0; j < stackSize; j++) {
            System.out.print(stackArray[j] + " | ");
        }
        printLineDecorator();
    }

    public void printLineDecorator() {
        System.out.println("");
        for (int k = 0; k < stackSize * 5; k++) {
            System.out.print("-");
        }
        System.out.println("");
    }
    public void pushMany(String multipleValues){
      String[] tempString = multipleValues.split(" ");
      for (int i = 0; i < tempString.length; i ++){
          push(tempString[i]);
      }
    }

    public static void main(String[] args) {
        TheStack theStack = new TheStack(10);
        theStack.push("10");
        theStack.push("15");
        theStack.peek();
        theStack.pop();
        theStack.pushMany("12 13 14 15");
        theStack.displayTheStack();
    }
}
