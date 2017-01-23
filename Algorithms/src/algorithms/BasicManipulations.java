/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author javaday
 */
public class BasicManipulations {

    private int[] theArray = new int[50];

    private int arraySize = 10;

    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10) + 10;
        }
    }

    public void printArray() {
        System.out.println("----------");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) {
            return theArray[index];
        }
        return 0;
    }

    public boolean doesArrayContainsThisValue(int searchValue) {

        boolean valueInArray = false;

        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == searchValue) {
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < (arraySize - 1); i++) {
                theArray[i] = theArray[i + 1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value) {
        if (arraySize < 50) {

            theArray[arraySize] = value;

            arraySize++;
        }
    }

    public String linearSearchForValue(int value) {
        boolean valueInArray = false;

        String indexsWithValue = "";

        System.out.println("The Value was found in the following: ");

        for (int i = 0; i < arraySize; i++) {

            if (theArray[i] == value) {

                valueInArray = true;

                System.out.println(i + " ");

                indexsWithValue += i + " ";
            }
        }
        if (!valueInArray) {
            indexsWithValue = "None";

            System.out.println(indexsWithValue);
        }
        System.out.println();

        return indexsWithValue;
    }

    public void printLineDecorator() {
        System.out.println("");
        for (int k = 0; k < arraySize * 5; k++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    public void printHorzArray() {
        printLineDecorator();
        for (int i = 0; i < arraySize; i++) {
            System.out.print(i + "  | ");
        }

        printLineDecorator();
        for (int j = 0; j < arraySize; j++) {
            System.out.print(theArray[j] + " | ");
        }
        printLineDecorator();
    }

    public void bubbleSort() {
        for (int i = arraySize - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (theArray[j] > theArray[j + 1]) {
                    swapValues(j, j + 1);
                    printHorzArray();
                }
            }
        }
        printHorzArray();
    }

    public void swapValues(int indexOne, int indexTwo) {
        int temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }

    public void binarySearchForValue(int value) {
        int lowIndex = 0;
        int highIndex = arraySize - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;

            if (theArray[middleIndex] > value) {
                highIndex = middleIndex - 1;
            } else if (theArray[middleIndex] < value) {
                lowIndex = middleIndex + 1;
            } else {
                System.out.println("\nFound a match For: " + value + " at Index " + middleIndex);
                lowIndex = highIndex + 1;
            }
        }

    }

    public void selectionSort() {
        for (int x = 0; x < arraySize; x++) {
            int minimum = x;

            for (int y = x; y < arraySize; y++) {
                if (theArray[minimum] > theArray[y]) {
                    minimum = y;
                }

            }
            swapValues(x, minimum);
        }

    }

    public void insertionSort() {
        for (int i = 1; i < arraySize; i++) {
            int j = i;

            int toInsert = theArray[i];

            while ((j > 0) && (theArray[j - 1] > toInsert)) {
                theArray[j] = theArray[j - 1];
                j--;
            }
            theArray[j] = toInsert;
            System.out.println("/nArray[i] = " + theArray[i] + " theArray[j] = " + theArray[j] + " toInsert = " + toInsert);
        }
    }

//    public static void main(String[] args) {
//        BasicManipulations newArray = new BasicManipulations();
//
//        newArray.generateRandomArray();
//
//        newArray.printArray();

//        System.out.println(newArray.getValueAtIndex(3));
//
//        System.out.println(newArray.doesArrayContainsThisValue(19));
//
//        newArray.deleteIndex(4);
//
//        newArray.printArray();
//
//        newArray.insertValue(13);
//
//        newArray.printArray();
//
//        newArray.linearSearchForValue(17);
//
//        newArray.printHorzArray();
//
//        newArray.bubbleSort();
//
//        newArray.binarySearchForValue(13);
//        newArray.selectionSort();


}
