package org.example;

public class LinkedListMain {

    static class Node {
        int value;
        Node next;

        public Node(final int value, final Node next) {
            this.value = value;
            this.next = next;
        }
    }

    static class MyLinkedList {

        int size = 0;
        Node root;
        Node tail;

        public void add(Node node) {

            if (root == null) {
                this.root = node;
                this.tail = node;
            } else {

                tail.next = node;
                tail = node;
            }
            size++;

        }

        public Node get(int index) {

            if (index > size - 1 || (index < 0)) {
                return null;
            }

            if (root == null) {
                return root;
            }


            if (index == 0) {
                return root;
            }

            Node focusNode = root;
            for (int i = 1; i < size; i++) {

                focusNode = focusNode.next;
                if (i == index) {
                    return focusNode;
                }
            }
            return null;
        }

        public void remove(int index){

            if (index > size - 1 || (index < 0)) {
                return;
            }

            if (root == null) {
                return;
            }


            if (index == 0) {
                root = root.next;
                size--;
                if(size == 1){
                    tail = root;
                }
            }

            Node focusNode = root ;
            Node previusNode = null;
            for (int i = 1; i < size; i++) {

                previusNode = focusNode;
                focusNode = previusNode.next;

                if (i == index) {

                    previusNode.next = focusNode.next;
                    size--;

                    if(index == size - 1){
                        tail = previusNode;
                    }
                    break;
                }

            }
        }

        public void printLinkedList(){

            if(root==null){
                return;
            }

            Node focusNode = null;
            for(int i =0; i< this.size; i++){

                if(i==0){
                    focusNode = root;
                    System.out.println("Valor root:"+root.value+" ");
                    continue;
                }

                focusNode = focusNode.next;
                System.out.println("Valor: "+focusNode.value);
            }
        }

        public int getSize(){
            return size;
        }
    }

    public static void main(final String[] args) {

        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(new Node(10, null));

        linkedList.add(new Node(7, null));
        linkedList.add(new Node(5, null));
        linkedList.add(new Node(15, null));
        linkedList.add(new Node(9, null));

        linkedList.remove(2);


        System.out.println(linkedList.size);
        linkedList.printLinkedList();

    }

}
