package com.instanceofjava.bubblesort;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] array = {4, 2, 5, 6, 9, 1};

        int n = array.length;
        int k;

        for (int m = n; m >= 0; m--) {
            for (int j = 0; j < n - 1; j++) {
                k = j + 1;
                if (array[j] > array[k]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[k];
                    array[k] = temp;
                }
            }

            for (int x = 0; x < array.length; x++) {
                System.out.print(array[x] + ", ");
            }

            System.out.println();
        }

    }
}
