public class Singlylist<E> {
    private Node<E>head=null;
    private Node<E>tail=null;
    private int size=0;

public Singlylist(){

}

    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;

    }
    public E first()
    {
        if (isEmpty())return null;
        return head.getElement();
    }
    public E last()
    {
        if (isEmpty())return null;
        return tail.getElement();
    }
    public void addfirst(E element)
    {
        head=new Node<E>(element,head);
        if (size==0)
            tail=head;
        size++;
    }
    public void addlast(E elemnt)
    {
        Node<E>newest=new Node<E>(elemnt,null);
        if(isEmpty())
            head=newest;
        else
            tail.setNext(newest);
        tail=newest;
        size++;
    }
    public E removefirst()
    {
        if(isEmpty())return null;
        E x=head.getElement();
        head=head.getNext();
        size--;
        if (size==0)
            tail=null;
        return x;
    }











    public static class Node<E>
    {
        private E element;
        private Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

}
