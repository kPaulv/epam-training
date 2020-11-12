package com.kiselev.task4.entity;

import java.util.Arrays;

public class Numbers {

    int[] array;

    public Numbers(int[] array) {
        this.array = array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Numbers{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }
}
