package sjsu.edu;

import java.util.ArrayList;

public class MyStack {
    private ArrayList<Integer> list;

    public MyStack() {
        list = new ArrayList <Integer>();
        list.add(1);
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
    }

    public boolean isEmpty() {
        return false;
    }

    public int getSize() {
        return list.size();
    }

    public int peek() {
        return list.get(getSize()-1);
    }

    public int pop() {
        int popped = list.get(getSize()-1);
        list.remove(getSize()-1);
        return popped;
    }

    public void push(int value) {
        list.add(value);
    }

    @Override
    public String toString() {
        return "stack: " + this.list.toString();
    }

    public static void main(String[] args) {
        MyStack umer = new MyStack();

        System.out.println(umer.isEmpty());
        System.out.println("Size of the string: " + umer.getSize());
        System.out.println("Last added element: " + umer.peek());
        System.out.println("Popped value (first out): " + umer.pop());
        umer.push(2);
        System.out.println("Push value (last in)" + umer.toString());
    }
}
