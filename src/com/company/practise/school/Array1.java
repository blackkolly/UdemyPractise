package com.company.practise.school;

public class Array1 {
    private int[] data;
    private int DEFAULT_SIZE = 10;
    private int size = 0;

    public Array1(int[] data, int DEFAULT_SIZE, int size) {
        this.data = data;
        this.DEFAULT_SIZE = DEFAULT_SIZE;
        this.size = size;
    }void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];
        for ( int i = 0; i < data.length; i++) {
            temp[i] = data[i];

        }
    }

    private boolean isFull(){
        return size == data.length;
    }

    public static void main(String[] args) {

    }
}
