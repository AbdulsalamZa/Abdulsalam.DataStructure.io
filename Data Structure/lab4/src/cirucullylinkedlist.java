public class cirucullylinkedlist<E> {

    private node<E> tail=null;
    private int size=0;

    public cirucullylinkedlist() {

    }
    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public E first(){
        if (isEmpty())return null;
        return tail.getNext().getElemnt();
    }
    public E last(){
        if (isEmpty())return null;
        return tail.getElemnt();
    }
    public void addFirst(E ele)
    {
        if (isEmpty()){
            tail=new node<E>(ele,null);
            tail.setNext(tail);
        }
        else
        {
            node<E>newwst=new node<E>(ele,tail.getNext());
            tail.setNext(newwst);
        }
        size++;
    }
    public void addLast(E ele)
    {
      addFirst(ele);
      tail=tail.getNext();
    }
    public E removeFirst()
    {
        if (isEmpty())return null;
        node<E>x=tail.getNext();
        if (x==tail) tail=null;
        else tail.setNext(x.getNext());
        size--;
        return x.getElemnt();
    }
    public void rotate()
    {
        if (tail !=null)
            tail=tail.getNext();
    }


    private static class node<E>{
        private E elemnt;

        public E getElemnt() {
            return elemnt;
        }

        public void setElemnt(E elemnt) {
            this.elemnt = elemnt;
        }

        public node<E> getNext() {
            return next;
        }

        public void setNext(node<E> next) {
            this.next = next;
        }

        public node(E elemnt, node<E> next) {
            this.elemnt = elemnt;
            this.next = next;
        }

        private node<E> next;

    }
}
