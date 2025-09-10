import java.util.*;

// Custom exception
class MyArrayIndexOutOfBoundsException extends RuntimeException {
    public MyArrayIndexOutOfBoundsException(String message) {
        super(message);
    }
}
interface MyIterator<E>
{
    public boolean hasNext();
    public E next();
    public void remove1();
}

class MyArrayList<E> {
    private E[] arr;                 // internal array
    private int indx = 0;            // number of elements
    public static final int DEFAULT_CAPACITY = 10;

    // Constructors
    public MyArrayList() {
        arr = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        arr = (E[]) new Object[capacity];
    }

    public MyArrayList(MyArrayList<? extends E> coll) {
        arr = (E[]) new Object[coll.size()];
        for(int i = 0; i < coll.size(); i++) {
            arr[i] = coll.get(i);
        }
        indx = coll.size();
    }

    // Size
    public int size() {
        return indx;
    }

    // Get
    public E get(int pos) {
        if (pos < 0 || pos >= size()) {
            throw new MyArrayIndexOutOfBoundsException("Index " + pos + " out of bounds for length " + size());
        }
        return arr[pos];
    }

    // Add at end
    public boolean add(E element) {
        ensureCapacity();
        arr[indx++] = element;
        return true;
    }

    // Add at index
    public boolean add(int pos, E element) {
        if (pos < 0 || pos > size()) {
            throw new MyArrayIndexOutOfBoundsException("Index " + pos + " out of bounds for length " + size());
        }

        ensureCapacity();

        for (int i = size(); i > pos; i--) {
            arr[i] = arr[i - 1]; // shift right
        }

        arr[pos] = element;
        indx++;
        return true;
    }

    // Ensure capacity
    private void ensureCapacity() {
        if (arr.length == size()) {
            int newCap = getCapacity(arr.length);
            E[] newArr = (E[]) new Object[newCap];
            for (int i = 0; i < size(); i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    // Expand capacity rule
    public int getCapacity(int oldCap) {
        return (int) (oldCap * 1.5) + 1;
    }

    // Remove by index
    private boolean remove(int oldIndex) {
        if (oldIndex < 0 || oldIndex >= size()) return false;
        for (int i = oldIndex; i < size() - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--indx] = null; // clear last
        return true;
    }

    // Remove all
    public boolean removeAll(MyArrayList<? extends E> coll) {
        boolean flag = false;
        for (int i = 0; i < coll.size(); i++) {
            int oldIndex = indexOf(coll.get(i));
            if (oldIndex != -1) {
                if (remove(oldIndex)) flag = true;
            }
        }
        return flag;
    }

    // IndexOf
    private int indexOf(E e) {
        for (int i = 0; i < size(); i++) {
            if (arr[i].equals(e)) return i;
        }
        return -1;
    }

    // LastIndexOf
    public int lastIndexOf(E element) {
        for (int i = size() - 1; i >= 0; i--) {
            if (arr[i].equals(element)) return i;
        }
        return -1;
    }

    // Contains
    public boolean contains(E element) {
        return indexOf(element) != -1;
    }

    // Set
    public E set(int pos, E element) {
        if (pos < 0 || pos >= size()) {
            throw new MyArrayIndexOutOfBoundsException("Index " + pos + " out of bounds for length " + size());
        }
        E temp = arr[pos];
        arr[pos] = element;
        return temp;
    }

    // Clear
    public void clear() {
        arr = (E[]) new Object[arr.length];
        indx = 0;
    }

    // IsEmpty
    public boolean isEmpty() {
        return indx == 0;
    }

    // AddAll
    public boolean addAll(MyArrayList<? extends E> coll) {
        boolean flag = false;
        for (int i = 0; i < coll.size(); i++) {
            if (add(coll.get(i))) flag = true;
        }
        return flag;
    }

    // toString
    @Override
    public String toString() {
        if (size() == 0) return "[]";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size(); i++) {
            sb.append(arr[i]);
            if (i < size() - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
    public MyIterator iterator()
    {
        return new Itr();
    }

// Iterator inner class 
    private class Itr implements MyIterator<E>
    {
        private int counter;
        @Override
        public boolean hasNext()
        {
            
            if(counter < size()) return true;
            return false ;
        }
        @Override
        public E next() {
            E temp =arr[counter++];
            return temp;
        }
    
        public void remove1() {
            remove(counter);
        }

    }

}

// Driver class
public class MyArrayListDriver {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1, 4);
        System.out.println("List1: " + list1);

        // MyArrayList<Integer> list2 = new MyArrayList<>(list1);
        // list2.add(25);
        // System.out.println("List2 (copy of List1 + 25): " + list2);

        // System.out.println("Contains 20? " + list1.contains(20));
        // System.out.println("Index of 30: " + list1.lastIndexOf(30));

        // list1.removeAll(list2);
        // System.out.println("List1 after removeAll(list2): " + list1);

        MyIterator iterator=list1.iterator();
        
        
        // iterator.remove1();
        while (iterator.hasNext()) {
             //System.out.println(iterator.next()); 
            if((Integer)iterator.next() %2!=0) iterator.remove1();
        }
        System.out.println(list1);
    }
}
