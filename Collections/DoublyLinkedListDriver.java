
class NoSuchElementFoundException extends RuntimeException  {
    public NoSuchElementFoundException()
    {
        super();
    }
}
class MyIndexOutOfBoundsException extends RuntimeException{
    public MyIndexOutOfBoundsException(String desc)
    {
        super(desc);
    }
}

class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int indx;

    private static class Node<E> {
        E ele;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev,E ele) {
            this.ele = ele;
            this.prev = prev;
        }
    }

    public String toString() {
        Node<E> currNode = head;
        String data = "[";
        if(indx==0) {
            return "[]";
        }
        for(int i = 0; i < indx-1; i++) {
            data += currNode.ele + ", ";
            currNode = currNode.next;
        }
        return data +=currNode.ele + "]";
    }

    public void addLast(E ele) {
        Node<E> newNode = new Node<E>(tail, ele);
        if(indx == 0) {
            head = newNode;
            tail = head;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        indx++;
    }

    public int size() {
        return indx;
    }

    public void clear() {
        head = null;
        tail = head;
        indx = 0;
    }

    public boolean isEmpty() {
        return indx == 0;
    }

    public void addFirst(E ele) {
        if(indx == 0) {
            addLast(ele);
            return;
        } else {
            Node<E> newNode = new Node<E>(null, ele);
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            indx++;
        }
    }

    public E removeFirst() {
        if(indx == 0) {
            throw new NoSuchElementFoundException();
        }
        E temp = head.ele;
        head = head.next;
        head.prev = null;
        indx--;
        return temp;
    }

    public E removeLast() {
        if(indx == 0) {
            throw new NoSuchElementFoundException();
        }
        E temp = tail.ele;
        if(indx == 1) {
            clear();
            return temp;
        } else {
            tail = tail.prev;
            tail.next.prev = null;
            tail.next=null;
            indx--;
        }
        return temp;
    }

    public E remove(int indx) {
        if(indx < 0 || indx >= size()) {
            throw new MyIndexOutOfBoundsException("Index : " + indx + ", size : " + size());
        }
        if(indx == 0) {
            return removeFirst();
        } else if(indx == size() - 1) {
            return removeLast();
        }

        Node<E> tempNode;
        Node<E> currNode = head;
        for(int i = 0; i < indx - 1; i++) {
            currNode = currNode.next;
        }
        tempNode = currNode.next;
        currNode.next = currNode.next.next;
        currNode.next.prev = currNode;
        tempNode.next = null;
        tempNode.prev = null;
        this.indx--;
        return tempNode.ele;
    }

    public String reverseOrder() {
        String data = "[";
        if(indx == 0) {
            return "[]";
        } else {
            Node<E> currNode = tail;
            while(currNode.prev != null) 
            {
                data = currNode.ele + ", ";
                currNode = currNode.prev;
            }
            data = currNode.ele+"]";
        }
        return data + "]";
    }
}

// Driver class with main method
public class DoublyLinkedListDriver {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list1 = new DoublyLinkedList<>();
        list1.addLast(10);
        list1.addLast(20);
        System.out.println(list1);
        // System.out.println(list1.removeLast());
        // System.out.println(list1.removeLast());
        // System.out.println(list1.removeLast());
        // System.out.println(list1);
    }
}