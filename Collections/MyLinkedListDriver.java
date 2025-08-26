import java.util.*;

// Custom Exception classes
class NoSuchElementFoundException extends RuntimeException {
    public NoSuchElementFoundException(String message) {
        super(message);
    }
}

class MyIndexOutOfBoundsException extends RuntimeException {
    public MyIndexOutOfBoundsException(String message) {
        super(message);
    }
}

class MyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int indx = 0;
    
    // Inner Node class
    private static class Node<E> {
        E ele;
        Node<E> next;
        
        Node(E ele) {
            this.ele = ele;
            this.next = null;
        }
    }
    
    // Add element to the end of the list
    public void add(E ele) {
        Node<E> newNode = new Node<>(ele);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node<E> currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            tail = newNode;
        }
        indx++;
    }
    
    // Get the size of the list
    public int size() {
        return indx;
    }
    
    // Get the first element
    public E getFirst() {
        if (indx == 0)
            throw new NoSuchElementFoundException("");
        return head.ele;
    }
    
    // Get the last element
    public E getLast() {
        if (indx == 0)
            throw new NoSuchElementFoundException("");
        return tail.ele;
    }
    
    // Remove the first element
    public E removeFirst() {
        if (indx == 0)
            throw new NoSuchElementFoundException("");
        E temp = head.ele;
        head = head.next;
        if (indx == 1) tail = null;
        indx--;
        return temp;
    }
    
    // Remove the last element
    public E removeLast() {
        if (indx == 0)
            throw new NoSuchElementFoundException("");
        E temp = tail.ele;
        Node<E> currNode = head;
        for (int i = 0; i < size() - 1; i++) {
            System.out.println(currNode.ele);
            currNode = currNode.next;
        }
        currNode.next = null;
        tail = currNode;
        if (indx == 1) head = null;
        indx--;
        return temp;
    }
    
    // Add element at the beginning
    public void addFirst(E ele) {
        Node<E> newNode = new Node<>(ele);
        newNode.next = head;
        head = newNode;
        if (indx == 0) tail = newNode;
        indx++;
    }
    
    // Add element at the end (same as add)
    public void addLast(E ele) {
        add(ele);
    }
    
    // Get element at specific index
    public E get(int index) {
        if (index < 0 || index >= size())
            throw new MyIndexOutOfBoundsException
            ("Index: " + index + ", Size: " + size());
        Node<E> currNode = head;
        for (int i = 0; i < index; i++) {
            currNode = currNode.next;
        }
        return currNode.ele;
    }
    
    // Set element at specific index
    public E set(int index, E ele) {
        if (index < 0 || index >= size())
            throw new MyIndexOutOfBoundsException
            ("Index: " + index + ", Size: " + size());
        Node<E> currNode = head;
        for (int i = 0; i < index; i++) {
            currNode = currNode.next;
        }
        E oldValue = currNode.ele;
        currNode.ele = ele;
        return oldValue;
    }
    public boolean contains(E ele)
    {
        Node<E> currNode= head;
        while(currNode!=null)
        {
            if(currNode.ele==ele) return true;
            currNode=currNode.next;
        }
        return false;
    }
    public void clear()
    {
        head=null;
        tail=null;
        indx=0; 
    }
    public int indexOf(E ele)
    {
        Node<E> currNode=head;
        for(int i=0;currNode!=null;i++)
        {
            if(currNode.ele.equals(ele)) return i;
            currNode=currNode.next;
        }
        return -1;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> currNode = head;
        while (currNode != null) {
            sb.append(currNode.ele);
            if (currNode.next != null) {
                sb.append(", ");
            }
            currNode = currNode.next;
        }
        sb.append("]");
        return sb.toString();
    }
}

// Driver class for testing
public class MyLinkedListDriver {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(100); // 0
        list1.add(200); // 1
        list1.add(300); // 2
        list1.add(400); // 3
        list1.add(500); // 4
        System.out.println(list1);
        // System.out.println(list1.contains(600));
        // list1.clear();
        System.out.println(list1.indexOf(400));
        System.out.println(list1);

        System.out.println("=============================================================");
        
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.add(100); // 0
        list2.add(200); // 1
        list2.add(300); // 2
        list2.add(400); // 3
        list2.add(500); // 4
        System.out.println(list2);
        
        // System.out.println(list2.set(list2.size() - 1, 30000));
        // System.out.println(list2.getLast());
        // System.out.println(list2.contains(600));
        // list2.clear();
        System.out.println(list2.indexOf(500));
        System.out.println(list2);
    }
}
