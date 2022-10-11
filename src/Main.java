import oop.collections.list.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Main main = new Main(); Al crear un objeto de la clase Main sí puedo llamar a test
        //main.testLinkedList(); //porque es un método parte de main y como main es static, o sea, global
    }

    private static void testLinkedList() {
        LinkedList linkedList0 = new LinkedList();
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();

        linkedList0.add("0");
        linkedList0.remove(0);

        linkedList1.add("1");
        linkedList1.add("2");
        linkedList1.add("3");
        String value = linkedList1.getData(0);
        value = linkedList1.getData(1);
        value = linkedList1.getData(2);
        linkedList1.remove(1);

        linkedList2.add("5");
        linkedList2.add("6");
        linkedList2.setAt(0, "Hola");
        linkedList2.setAt(1, "Mundo");
        linkedList2.remove(1);

        linkedList3.add("7");
        linkedList3.add("8");
        linkedList3.remove(1);
    }
}