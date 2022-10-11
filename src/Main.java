import oop.collections.list.arraylist.ArrayList;
import oop.collections.list.arraylist.ArrayListIterator;
//import oop.collections.list.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Main main = new Main(); Al crear un objeto de la clase Main sí puedo llamar a test
        //main.testLinkedList(); //porque es un método parte de main y como main es static, o sea, global

        ArrayList datos = new ArrayList();

        datos.addAtTail("uno");
        datos.addAtTail("dos");
        datos.addAtTail("tres");

        datos.addAtFront("u");
        datos.addAtFront("d");
        datos.addAtFront("t");

        ArrayListIterator iterator = datos.getIterator();

        while(iterator.hasNext()) {
            String value = iterator.next();

            System.out.println(value);
        }
    }
}