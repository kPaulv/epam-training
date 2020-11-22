package com.kiselev.task1.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Objects;

public class Array {
    private static final Logger logger = LogManager.getLogger(Array.class.getName());

    int[] array;
    int size;

    public Array() {
        size = 0;
        array = new int[0];
        logger.info("New array created.");
    }

    public Array(int size) {
        this.size = size;
        array = new int[size];
        logger.info("New array created.");
    }

    public Array(int[] array) {
        size = array.length;
        this.array = new int[size];
        for(int i = 0; i < size; i++) {
            this.array[i] = array[i];
        }
        logger.info("New array created.");
    }

    public int[] getArray() {
        return array;
    }

    public int getSize() {
        return size;
    }

    public void setArray(int[] array) {
        this.array = array;
        logger.info("Array set.");
    }

    public void setSize(int size) {
        this.size = size;
        logger.info("Array size set.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Array{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append(", size=").append(size);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Array array1 = (Array) o;
        return size == array1.size &&
                Arrays.equals(array, array1.array);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(array);
        return result;
    }
}
