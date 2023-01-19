package org.example;

public class StackMain {

    public static void main(final String[] args) {
        final Stack stack = new Stack();
        stack.create(3);
        stack.push(3);
        stack.push(8);
        stack.push(6);
        stack.push(10);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }

    static class Stack {
        int[] array;
        int last = -1;

        int size = 0;

        public void create(final int size) {
            array = new int[size];
        }

        public void push(final int value) {

            if(last == -1){
                last++;
            }

            if (last  < array.length && size< array.length) {
                array[last] = value;
                size++;

                if(last+1 < array.length){
                    last++;
                }

            } else {
                System.out.println("Stack is full!");
            }
        }

        public int pop() {
            if (last < 0 || last>array.length - 1) {
                System.out.println("Stack doesn't have more elements!");
                return -1;
            }
            final int value = array[last];
            if(last-1 >= 0){
                last--;
            }
            System.out.println("Pops the value:"+value);
            return value;
        }
    }
}
