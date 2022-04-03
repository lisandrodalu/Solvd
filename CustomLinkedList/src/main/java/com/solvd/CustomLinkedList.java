package com.solvd;

public class CustomLinkedList<T>{

    private Node head;


    public CustomLinkedList() {
        this.head = null;
    }
    public void add(T data){
        Node newNode  = new Node(data);
        Node actual = this.head;

        while(actual!=null && actual.getNext()!=null){
            actual = actual.getNext();
        }

        if(this.head==null)
            this.head=newNode;
        else
        actual.setNext(newNode);

    }
    //Adds in an specific index

    public Node getHead() {
        return head;
    }


    @Override
    public String toString() {
        Node actual  =this.head;
        String result = "";
        while(actual!=null){
            result+=actual.getData().toString()+" ";
            actual = actual.getNext();
        }
        return result;
    }
}
