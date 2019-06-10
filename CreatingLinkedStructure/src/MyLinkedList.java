public class MyLinkedList<E> extends MyAbstractList<E> {

    private Node<E> head, tail;

    public MyLinkedList() {

    }

    public MyLinkedList(E[] objects) {
        super(objects);
    }

    public E getFirst() {
        if(size == 0)
            return null;
        else{
            return head.element;
        }
    }

    public E getLast() {
        if(size == 0)
            return null;
        else{
            return tail.element;
        }
    }


}
