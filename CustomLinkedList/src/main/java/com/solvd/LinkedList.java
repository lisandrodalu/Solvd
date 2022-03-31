package com.solvd;

public class LinkedList<T>{

    private Node head;
    private int index;

    public LinkedList() {
        this.head = new Node(null);
        this.index = 0;
    }
    public void addNode(T data){
        Node newNode  = new Node(data);
        Node actual = this.head;
        while(actual.getNext()!=null){
            actual = actual.getNext();
        }
        actual.setNext(newNode);
        index++;
    }

    public Node getHead() {
        return head;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        Node actual  = head;
        String result = "";
        while(actual!=null){
            result+=actual.getData().toString()+" ";
            actual = actual.getNext();
        }
        return result;
    }
}
