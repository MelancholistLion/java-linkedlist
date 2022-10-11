package oop.collections.list.linkedlist;

public class LinkedListIterator {
    Node node;

    public LinkedListIterator(Node node){
        this.node = node;
    }

    public boolean HasNext(){
        return node != null;
    }

    public String Next(){
        String data = node.getData();
        node = node.getNext();
        return data;
    }
}
