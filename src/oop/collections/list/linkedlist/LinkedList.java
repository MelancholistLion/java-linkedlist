package oop.collections.list.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListIterator getIterator() {
        return new LinkedListIterator(head);
    }

    public void add(String data) {
        Node node = new Node(data);

        node.setPrevious(tail);
        tail = node;

        if(head == null) {
            head = node;
        } else {
            node.getPrevious().setNext(node);
        }
        size++;
    }

    private Node findNodeByIndex(int index) {
        Node iteratorNode = head;
        int indexIteratorNode = 0;

        while(indexIteratorNode < index) {
            iteratorNode = iteratorNode.getNext();
            indexIteratorNode++;
        }
        return iteratorNode;
    }

    public boolean remove(int indexToRemove) {

        if(indexToRemove < 0 || indexToRemove >= size) {
            return false;
        }

        if(size == 1) {
            head = null;
            tail = null;
        } else if(indexToRemove == 0) {
            head = head.getNext();
            head.setPrevious(null);
        } else if(indexToRemove == size -1) {
            tail = tail.getPrevious();
            tail.setNext(null);
        }else {
            Node iteratorNode = findNodeByIndex(indexToRemove);
            iteratorNode.getPrevious().setNext(iteratorNode.getNext());
            iteratorNode.getNext().setPrevious(iteratorNode.getPrevious());
        }

        size--;
        return true;
    }

    public boolean setAt(int index, String data) {
        if(index < 0 || index >= size) {
            return false;
        }
        Node node = findNodeByIndex(index);
        node.setData(data);
        return true;
    }
    public String getData(int index) {
        if(index < 0 || index >= size) {
            return null;
        }
        Node node = findNodeByIndex(index);

        return node.getData();
    }

    public int getSize() {
        return size;
    }
}
