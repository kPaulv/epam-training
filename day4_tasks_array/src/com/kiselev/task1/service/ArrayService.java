package com.kiselev.task1.service;

import com.kiselev.task1.entity.Array;

import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;


public class ArrayService {
    private static final Logger logger = LogManager.getLogger(ArrayService.class.getName());

    public int[] createArray() {
        int size;
        System.out.println("Enter size: ");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Fill array: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public int[] createArrayFromFile() throws IOException {
        int size;
        BufferedReader br = new BufferedReader(new FileReader("src/input.txt"));
        StringTokenizer st = new StringTokenizer(br.readLine());
        size = Integer.parseInt(st.nextToken());
        int[] array = new int[size];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        return array;
    }

    public int[] createArrayOfRandom() {
        Random random = new Random();
        int size = random.nextInt(21);

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(201) - 100;
        }
        return array;
    }

    public int[] bubbleSort(Array array) {
        int[] arr = array.getArray();
        int bound = arr.length - 1;
        boolean swapped;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < bound; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            bound--;
        }
        logger.info("Array sorted with bubble sort.");
        return arr;
    }

    public int[] insertionSort(Array array) {
        int[] arr = array.getArray();
        int j;
        int temp;
        for (int i = 1; i < arr.length; i++) {
            j = i;
            while (j > 0 && (arr[j - 1] > arr[j])) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        logger.info("Array sorted with insertion sort.");
        return arr;
    }

    public int[] selectionSort(Array array) {
        int[] arr = array.getArray();

        int minIndex;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        logger.info("Array sorted with selection sort.");
        return arr;
    }

    public int binarySearch(Array array, int number) {
        int[] arr = array.getArray();
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == number) {
                return middle;
            } else if (arr[middle] < number) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }

    public int max(Array array) {
        int[] arr = array.getArray();
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public int min(Array array) {
        int[] arr = array.getArray();
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int[] findPrimeNumbers(Array array) {
        int[] arr = array.getArray();
        int[] primeArray = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeArray[j] = arr[i];
                j++;
            }
        }

        if (j < primeArray.length) {
            int[] temp = new int[j];
            if (j >= 0) System.arraycopy(primeArray, 0, temp, 0, j);
            primeArray = new int[j];
            if (j >= 0) System.arraycopy(temp, 0, primeArray, 0, j);
        }

        return primeArray;
    }

    private boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
