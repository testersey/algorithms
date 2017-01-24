/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author javaday http://algs4.cs.princeton.edu/21elementary/  
 *                   http://www.programcreek.com/2012/11/top-10-algorithms-for-coding-interview/
 */
public class Algorithms {

    /*
    
    Rotate an array of n elements to the right by k steps.
    For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
    How many different ways do you know to solve this problem?
     */
    private int[] theArray = new int[7];

    int arraySize = 7;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Algorithms newArray = new Algorithms();
        newArray.generateOrderedArray();
        newArray.rotateArraytoRightByKSteps(4);
      
    }

    public void generateOrderedArray() {
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = i + 1;
        }
        displayArray(theArray);
    }

    public void rotateArraytoRightByKSteps(int steps) {
        displayArray(theArray);

        for (int i = arraySize - steps, j = 0; i < arraySize; i++, j++) {
            int temp = theArray[i];
            theArray[i] = theArray[j];
            theArray[j] = temp;
            displayArray(theArray);
        }
       // displayArray(theArray);
    }

    public void displayArray(int[] arr) {
        for (int i = 0; i < theArray.length; i++) {
            System.out.print(theArray[i] + ", ");
        }
        System.out.println();
    }
}
