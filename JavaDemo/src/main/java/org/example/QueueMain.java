package org.example;

public class QueueMain {

    public static void main(final String[] args) {

        final Queue queue = new Queue();
        queue.create(10);

        queue.enqueue(8);
        queue.enqueue(6);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.enqueue(4);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();


    }

    static class Queue {

        private int[] array;

        private int last;

        private int front;

        public Queue() {
        }

        public void create(final int size) {

            array = new int[size];
            last = -1;
            front = -1;
        }

        public void enqueue(final int value) {

            if (++last < array.length) {
                array[last] = value;

                if(front == -1){
                    front++;
                }
            } else {
                System.out.println("Queue is full!");
            }
        }

        public int dequeue() {

            if(front< array.length){
                final int value = array[front++];
                System.out.println("Dequeue value: "+value);
                return value;
            }
            else{
                System.out.println("Queue doesn't have more space!");
                return -1;
            }


        }

    }

}
