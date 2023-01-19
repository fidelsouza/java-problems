package org.example;

public class BinaryTree {


    public static void main(final String[] args) {

        // 2 6 9 45 74 86 97 110
        BinaryTree bt = new BinaryTree();
        bt.addNode(8);
        bt.addNode(3);
        bt.addNode(1);
        bt.addNode(14);
        bt.addNode(7);
        bt.addNode(12);

        bt.traversePreOrder(bt.root);

    }

    private Node root;

    class Node {
        int value;
        Node leftNode;
        Node rightNode;

        public Node(final int value, final Node leftNode, final Node rightNode) {
            this.value = value;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }
    }

    private void addNode(final int value) {

        if (root == null) {
            this.root = new Node(value, null, null);
            return;
        }

        Node focusNode = root;

        while (true) {

            if (value < focusNode.value) {

                if (focusNode.leftNode == null) {
                    focusNode.leftNode = new Node(value, null, null);
                    break;
                } else {
                    focusNode = focusNode.leftNode;
                }
            }
            else if (value > focusNode.value) {
                if (focusNode.rightNode == null) {
                    focusNode.rightNode = new Node(value, null, null);
                    break;
                } else {
                    focusNode = focusNode.rightNode;
                }
            }
            else{
                break;
            }
        }

    }

    //The in-order traversal consists of first visiting the left sub-tree, then the root node, and finally the right sub-tree
    private void traverseInOrder(Node node){

        if(node!=null){
            traverseInOrder(node.leftNode);
            System.out.println(node.value);
            traverseInOrder(node.rightNode);
        }

    }

    //Pre-order traversal visits first the root node, then the left sub-tree, and finally the right sub-tree
    private void traversePreOrder(Node node){

        if(node!=null){
            System.out.println(node.value);
            traversePreOrder(node.leftNode);
            traversePreOrder(node.rightNode);
        }

    }

    //Post-order traversal visits the left sub-tree, the right subt-ree, and the root node at the end
    private void traversePostOrder(Node node){

        if(node!=null){
            traversePostOrder(node.leftNode);
            traversePostOrder(node.rightNode);
            System.out.println(node.value);
        }

    }
}
