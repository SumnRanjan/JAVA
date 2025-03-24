package OPPS.Generics;

import OPPS.Properties.Polymorphism.Number;

import java.util.Arrays;

//here t should either number or its subclasses
// T extend Number upperbound wildcard
public class CustomGenArrayList<T> {

    private Object[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList() {
        data = new Object[DEFAULT_SIZE];
    }

    //This is wild card
//    public void getList(List<? extends Number>list){
//        //do something
//    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T val) {
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
        CustomGenArrayList<Integer>list = new CustomGenArrayList<>();

        for (int i = 0; i < 14; i++) {
            list.add(i * 2);
        }

        System.out.println(list);
        list.remove();
        System.out.println(list);
        list.add(100);
        System.out.println(list);
    }
}
