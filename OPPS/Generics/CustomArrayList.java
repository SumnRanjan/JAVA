package OPPS.Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int [] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public  void add(int num){
        if(isFull()){
            resize();
        }

        data[size++] = num;
    }

    private void resize() {
        int [] temp = new int[data.length * 2];

        System.arraycopy(data, 0, temp, 0, data.length);

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index , int val){
        data[index] = val;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();

//        list.add(3);
//        list.add(4);
//        list.add(5);

        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }

        System.out.println(list);
    }
}
