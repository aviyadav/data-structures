package com.instanceofjava.mergesortalgorithm;

public class MergeSortAlgorithm {

    private int[] resarray;
    private int[] tempMergArray;
    private int length;

    public static void main(String[] args) {
        int[] inputArr = {6, 42, 2, 32, 15, 8, 23, 4};
        System.out.println("Before sorting");
        for (int i : inputArr) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
        
        MergeSortAlgorithm mergeSortAlg = new MergeSortAlgorithm();
        mergeSortAlg.sort(inputArr);
        System.out.println("After sorting");
        for (int i : inputArr) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public void sort(int[] inputArr) {
        this.resarray = inputArr;
        this.length = inputArr.length;
        this.tempMergArray = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {
        if(lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergehalfs(lowerIndex, middle, higherIndex);
        }
    }

    private void mergehalfs(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArray[i] = resarray[i];
        }
        
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        
        while(i <= middle && j <= higherIndex) {
            if(tempMergArray[i] <= tempMergArray[j]) {
                resarray[k] = tempMergArray[i];
                i++;
            } else {
                resarray[k] = tempMergArray[j];
                j++;
            }
            k++;
        }
        
        while(i <= middle) {
            resarray[k] = tempMergArray[i];
            k++;
            i++;
        }
    }
}
