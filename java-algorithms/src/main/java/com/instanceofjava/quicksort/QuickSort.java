package com.instanceofjava.quicksort;

public class QuickSort {

    private int array[];
    private int length;

    public void sortElements(int[] arrayvalues) {

        if (arrayvalues == null || arrayvalues.length == 0) {
            return;
        }
        this.array = arrayvalues;
        length = arrayvalues.length;
        doQuickSort(0, length - 1);
    }

    private void doQuickSort(int lowIndex, int highIndex) {

        int i = lowIndex;
        int j = highIndex;

        int pivot = array[lowIndex + (highIndex - lowIndex) / 2];

        // now Divide the array into two arrays(actually we are maintaining single array only)
        while (i <= j) {

            while (array[i] < pivot) {
                i++;

            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swapElements(i, j);

                //move index to next position on both sides
                i++;
                j--;

            }
        }

        // call quickSort() method recursively
        if (lowIndex < j) {

            doQuickSort(lowIndex, j);
        }
        if (i < highIndex) {

            doQuickSort(i, highIndex);

        }
    }

    private void swapElements(int i, int j) {

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void main(String a[]) {

        QuickSort quicksort = new QuickSort();
        int[] inputarray = {32, 1, 23, 14, 43, 7, 6, 65};

        System.out.println("Before sorting");
        for (int i : inputarray) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");

        quicksort.sortElements(inputarray);

        System.out.println("After sorting");
        for (int i : inputarray) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
    }

}
