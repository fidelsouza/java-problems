package org.example;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    public static void main(final String[] args) {

        Random generator = new Random();
        int quant = 10000000;


        final int[] array = new int[quant];

        for(int i=0; i< array.length; i++){
                array[i] = generator.nextInt(quant);
        }

        System.out.println("Starting - time:"+ LocalDateTime.now());

        mergeSort(array);

        System.out.println("printing - time:"+ LocalDateTime.now());

        Arrays.stream(array).forEach(System.out::println);

    }

    private static void mergeSort(int[] array) {

        if (array.length < 2) {

            return;
        }

        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = array[i];
        }

        for (int i = mid; i < array.length; i++) {
            rightArray[i - mid] = array[i];
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        merge(array, leftArray, rightArray);

    }

    private static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {

        int leftPos = 0;
        int rightPos = 0;

        int cont = 0;
        while ((leftPos <= leftArray.length - 1) && (rightPos <= rightArray.length - 1)) {

            if (leftArray[leftPos] < rightArray[rightPos]) {
                inputArray[cont] = leftArray[leftPos];
                leftPos++;

            } else {
                inputArray[cont] = rightArray[rightPos];
                rightPos++;
            }
            cont++;
        }

        if (leftPos <= leftArray.length - 1) {

            for (int i = leftPos; i < leftArray.length; i++) {

                inputArray[cont] = leftArray[leftPos];
                leftPos++;
                cont++;
            }

        }
        //rightPos
        else {

            for (int i = rightPos; i < rightArray.length; i++) {

                inputArray[cont] = rightArray[rightPos];
                rightPos++;
                cont++;
            }
        }

    }
}
