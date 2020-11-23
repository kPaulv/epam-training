package com.kiselev.task1.main;

import com.kiselev.task1.entity.Array;
import com.kiselev.task1.report.ArrayReport;
import com.kiselev.task1.service.ArrayService;

import java.io.IOException;

public class ArrayMain {
    public static void main(String[] args) {

            ArrayService service = new ArrayService();
            ArrayReport report = new ArrayReport();
        try {
            //bubble
            int[] array1 = service.createArray();
            report.showArray(array1);
            Array array = new Array(array1);
            array1 = service.bubbleSort(array);
            report.showArray(array1);

            //insertion
            array1 = service.createArray();
            report.showArray(array1);
            array = new Array(array1);
            array1 = service.insertionSort(array);
            report.showArray(array1);

            //selection
            array1 = service.createArray();
            report.showArray(array1);
            array = new Array(array1);
            array.setArray(service.selectionSort(array));
            report.showArray(array1);

            array1 = service.createArray();
            report.showArray(array1);
            array = new Array(array1);
            int searchNum = 66;
            int index = service.binarySearch(array, searchNum);
            report.showNumber(searchNum, index);

            int[] primeArray = service.findPrimeNumbers(array);
            Array arrayPrime = new Array(primeArray);
            report.showPrimeArray(arrayPrime);

            int arrayMax = service.max(array);
            int arrayMin = service.min(array);
            report.showMax(arrayMax);
            report.showMin(arrayMin);

            array1 = service.createArrayFromFile();
            array = new Array(array1);
            report.showArray(array1);
            array1 = service.createArrayOfRandom();
            array = new Array(array1);
            report.showArray(array1);
        } catch (IOException e) {
            System.out.println("IOError.");
        }
    }
}
